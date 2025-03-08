using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att45.Models {
    public class Jogador {
        private int pontuação;
        public event Action<int>? PontuaçãoAtualizada;

        public void AdicionarPontos(int pontos){
            pontuação += pontos;
            OnPontuaçãoAtualizada(pontuação);
        }
        protected virtual void OnPontuaçãoAtualizada(int pontuacao){
            PontuaçãoAtualizada?.Invoke(pontuacao);
        }

        
    }
}