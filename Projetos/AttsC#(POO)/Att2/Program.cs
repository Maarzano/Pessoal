using ClassePessoa.Models;
using ClasseCurso.Models;

Pessoa pessoa1 = new();
pessoa1.Idade = 19;
pessoa1.Nome = "Arthur";
pessoa1.Sobrenome = "Marzano";

Pessoa pessoa2 = new();
pessoa1.Idade = 20;
pessoa1.Nome = "Patrícia";
pessoa1.Sobrenome = "Correa";

Curso Senai = new();
Senai.Nome = "Inglês";
Senai.Alunos = new List<Pessoa>();

Senai.AdicionarAluno(pessoa1);
Senai.AdicionarAluno(pessoa2);

Senai.ListarAlunos();
