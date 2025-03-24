using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BlindandoSeuCodigoComTDD.Models
{
    public class Tarefa {
        public int Id { get; set; }
        private static int IncrementId = 0;
        public string Nome { get; set; }
        public string Descricao { get; set; }
        public bool Status { get; set; }

        public Tarefa(string nome, string descricao){
            Id = ++IncrementId;
            Nome = nome;
            Descricao = descricao;
            Status = false;

        }
        public override string ToString(){
            return $"ID: {Id}, Nome {Nome}, {Descricao}, {Descricao}";

        }
    }
}