using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.NetworkInformation;
using System.Text.Json;
using System.Threading.Tasks;

namespace httpCat.Models {
    public class APIConection {
        private static readonly HttpClient _httpClient = new();

        public async Task<string> GetHttpCatImageUrl(int codeHttp){
            string url = $"https://http.cat/{codeHttp}";

            try{
                HttpResponseMessage response = await _httpClient.GetAsync(url);
                if (response.IsSuccessStatusCode){
                    return url;
                } else {
                    return "Erro ao carregar url da image, ou o código Http não existe";
                }
            } catch(Exception ex){
                return $"Erro ao acessar API: {ex.Message}";
            }
        }
        
    }
}