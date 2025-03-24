using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BlindandoSeuCodigoComTDD.Models
{
    public class GerenciadorDeTarefas {
        private ListaTarefas listaTarefas;
        public GerenciadorDeTarefas(List<Tarefa>? tarefas = null) {
            listaTarefas = new ListaTarefas();
            if (tarefas != null) {
                listaTarefas.Tarefas.AddRange(tarefas);
            }
        }
        public void CriarTarefa(string nome, string descricao){
            Tarefa task = new Tarefa(nome, descricao);
            listaTarefas.Tarefas.Add(task);
        }
        public List<Tarefa> ListarTarefas(){
            return listaTarefas.Tarefas;
        }
        public void AtualizarStatusTarefa(int id, bool status){
            Tarefa? tarefa = listaTarefas.Tarefas.FirstOrDefault(i => i.Id == id);
            if (tarefa != null){
                tarefa.Status = status;
            }
        }
        public void RemoverTarefa(int id){
            Tarefa? tarefa = listaTarefas.Tarefas.FirstOrDefault(i => i.Id == id);
            if (tarefa != null){
                listaTarefas.Tarefas.Remove(tarefa);
            }

        }
        
    }
}