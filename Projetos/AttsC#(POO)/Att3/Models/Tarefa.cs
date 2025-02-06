using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Tarefaa.Models {
    public class Tarefa {
        public int ID {get;}
        public string Descricao{get;}
        public bool concluida{get; private set;}
        public Tarefa(int id, string descricao){
            ID = id;
            Descricao = descricao;
            concluida = false;
        }
        public Tarefa(int id){
            ID = id;
            concluida = false;
        }
        public void Concluir(){
            concluida = true;
        }
    }
}