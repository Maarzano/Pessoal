using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;

namespace APIConselho.Models
{
    public class APIConection
    {
        private static readonly HttpClient _httpClient = new HttpClient();

        public async Task<string> GetAdviceAsync() {
            const string url = "https://api.adviceslip.com/advice";

            try {
                HttpResponseMessage response = await _httpClient.GetAsync(url);

                if (response.IsSuccessStatusCode) {
                    string json = await response.Content.ReadAsStringAsync();
                    AdviceResponse adviceResponse = JsonSerializer.Deserialize<AdviceResponse>(json, new JsonSerializerOptions { PropertyNameCaseInsensitive = true });

                    return adviceResponse?.Slip?.Advice ?? "Nenhum conselho recebido.";
                } else {
                    return $"Erro na requisição: {response.StatusCode}";
                }
            } catch (Exception ex){
                return $"Erro ao buscar conselho: {ex.Message}";
            }
        }
    }
}
