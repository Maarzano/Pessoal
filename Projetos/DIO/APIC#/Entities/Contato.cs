using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace APIC_.Entities
{
    public class Contato
    {
        public int ID { get; set; }
        public string Nome {get;set;}
        public int Idade { get; set; }
        public string Telefone {get; set;}
        public bool Ativo { get; set; }

    }
}