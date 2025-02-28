using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text.Json.Serialization;
using System.Threading.Tasks;
using ApiAgendamentoDeTarefas.Models;

namespace ApiAgendamentoDeTarefas.Entities
{
    public class Tarefa {
        [Key][JsonIgnore]
        public int IdTarefa { get; set; }
        public string Titulo { get; set; }
        public string Descricao { get; set; }
        public DateTime Data { get; set; }
        
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public TarefaStatus Status { get; set; } = TarefaStatus.PENDENTE;

        
    }
}