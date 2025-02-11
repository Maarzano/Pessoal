using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att8.Models
{
    public class Produto
    {
        public int ID { get; set; }
        public string Nome { get; private set; }
        public double Preco { get; private set; }
        public string Categoria { get; private set; }
        private static int proximoID = 1;

        public Produto(string nome, double preco, string categoria){
            ID = proximoID++;
            Nome = nome;
            Preco = preco;
            Categoria = categoria;
        }
        public void ExibirInfo(){
            Console.WriteLine($"ID: {ID}");
            Console.WriteLine($"Nome do produto: {Nome}");
            Console.WriteLine($"Preço do produto: R$ {Preco}");
            Console.WriteLine($"Categoria do produto: {Categoria}");
            Console.WriteLine();
        }
    }
}