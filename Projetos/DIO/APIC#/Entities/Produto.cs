using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text.Json.Serialization;
using System.Threading.Tasks;

namespace APIC_.Entities
{
    public class Produto
    {
        [Key][JsonIgnore]
        public int IdProduto { get; set; }
        public string Nome { get; set; }
        public double Preco { get; set; }

        [ForeignKey("Contato")][JsonIgnore]
        public int IdContato { get; set; }
        
        [JsonIgnore]
        public Contato Contato { get; set; }
    }
}