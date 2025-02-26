using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att8.Models
{
    public class Estoque
    {
        public List<Produto> produtos { get; set; }
        public Estoque(){
            produtos = new List<Produto>();
        }

        public void AdicionarProduto(Produto produto){
            produtos.Add(produto);
        }
        public void RemoverProduto(int id){
            var produto = produtos.Find(p => p.ID == id);
            if(produto != null){
                produtos.Remove(produto);
            } else {
                Console.WriteLine("Produto não encontrado");
            }
        }
        public void ListarProdutos(){
            if(!(produtos.Count == 0)){
                foreach (Produto p in produtos){
                    p.ExibirInfo();
                }
            } else {
                Console.WriteLine("Não tem produtos no estoque");
            }
        }

    }
}