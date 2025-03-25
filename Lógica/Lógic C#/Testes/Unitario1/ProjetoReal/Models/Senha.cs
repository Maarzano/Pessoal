using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace ProjetoReal.Models {
    public class Senha {
        public string? Password { get; set; }
        
        public Senha(string password){

            Password = password;

            if (!IsValidPassword()){
                throw new ArgumentException("Senha invalída");
            }
        }

        public bool IsValidPassword(){

            if(Password == null) return false;
            if (Password.Length < 8) return false;
            if (!Password.Any(char.IsDigit)) return false;
            if (!Password.Any(char.IsUpper)) return false;
            if (!Password.Any(char.IsLower)) return false;
            if (!Regex.IsMatch(Password, @"[\W_]")) return false;

            return true;
        }
        
    }
}