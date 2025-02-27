using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text.Json.Serialization;
using System.Threading.Tasks;

namespace APIC_.Entities
{
    public class Endereco
    {
        [Key]
        public int IdEndereco { get; set; }
        public string Rua { get; set; }
        public string Bairro { get; set; }
        public string Numero { get; set; }
        public int CEP { get; set; }

        [ForeignKey("Contato")]
        public int IdContato { get; set; }
        [JsonIgnore]
        public Contato Contato { get; set; }
    }
}