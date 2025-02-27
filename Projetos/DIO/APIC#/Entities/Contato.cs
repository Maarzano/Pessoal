using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace APIC_.Entities
{
    public class Contato
    {
        [Key]
        public int IdContato { get; set; }
        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Telefone { get; set; }
        public bool Ativo { get; set; }

        public ICollection<Endereco> Enderecos { get; set; }

        public ICollection<Produto> Produtos { get; set; }
    }
}