using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BlindandoSeuCodigoComTDD.Models
{
    public class ListaTarefas {
        public List<Tarefa> Tarefas {get; set;}

        public ListaTarefas(){
            Tarefas = [];
        }

        
    }
}