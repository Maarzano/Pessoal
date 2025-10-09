package att9;

public class PessoaBuilder{
        String nome;
        String sobrenome;
        int idade;
        String telefone;


        public PessoaBuilder setNome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder setSobrenome(String sobre){
            this.sobrenome = sobre;
            return this;
        }
        public PessoaBuilder setIdade(int idade){
            this.idade = idade;
            return this;
        }
        public PessoaBuilder setTelefone(String telefone){
            this.telefone = telefone;
            return this;
        }
        public Pessoa build(){
            if (this.nome == null){
                throw new IllegalArgumentException("Porra");
            }
            return new Pessoa(this);
        }
    }