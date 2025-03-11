using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.PortableExecutable;
using System.Threading.Tasks;

namespace Att57.Models {
    public class ConfigurationClass {
        public string? Cor { get; set; }
        public double Tamanho { get; set; }
        public int Quantidade { get; set; }
        
        public ConfigurationClass setCor(string str){
            Cor = str;
            return this;
        }
        public ConfigurationClass setTamanho(double tam){
            Tamanho = tam;
            return this;
        }
        public ConfigurationClass setQuantidade(int quantity){
            Quantidade = quantity;
            return this;
        }
        
    }
}