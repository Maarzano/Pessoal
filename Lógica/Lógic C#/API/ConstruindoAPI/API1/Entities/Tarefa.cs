using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;
using API1.Models;

namespace API1.Entities {
    public class Tarefa {
        [Key]
        public int IdTarefa { get; set;}
        public string Nome { get; set; }
        public string Descrição { get; set; }
        public DateTime DataCriação { get; set;} = DateTime.Today;
        public Status TarefaStatus { get; set; } = Status.FAZER;
        
    }
}