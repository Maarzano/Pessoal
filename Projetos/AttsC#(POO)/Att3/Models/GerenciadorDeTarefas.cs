using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Att3.Models;

namespace Att3.Models{
    public class GerenciadorDeTarefas{
        private List<Tarefa> tarefas = new List<Tarefa>();
        private int proximoId = 1;

        public void AdicionarTarefa(string descricao){
            Tarefa novaTarefa = new Tarefa(proximoId, descricao);
            tarefas.Add(novaTarefa);
            proximoId++;

        }
        public void RemoverTarefa(int id){
            Tarefa tarefa = tarefas.Find(t => t.ID == id);
            if(tarefa != null){
                tarefas.Remove(tarefa);
            } else {
                Console.WriteLine($"Tarefa com ID {id} não econtrada");
            }
        }

        public void ConcluirTarefa(int id){
            Tarefa tarefa = tarefas.Find(t => t.ID == id);
            if(tarefa != null){
                tarefa.Concluir();
            } else {
                Console.WriteLine($"Tarefa com ID {id} não econtrada");
            }
        }

        public void ListarTarefas(bool mostrarConcluidas){
            foreach(Tarefa t in tarefas){
                if (mostrarConcluidas || !t.concluida){
                    Console.WriteLine($"ID: {t.ID} | Descrição: {t.Descricao} | Concluida: {t.concluida}");
                }
            }

        }



    }
}