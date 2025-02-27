using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace APIC_.Entities
{
    public class Produto
    {
        [Key]
        public int IdProduto { get; set; }
        public string Nome { get; set; }
        public double Preco { get; set; }

        [ForeignKey("Contato")]
        public int IdContato { get; set; }

        public Contato Contato { get; set; }
    }
}