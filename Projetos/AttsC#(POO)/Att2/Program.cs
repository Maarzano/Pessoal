﻿using ClassePessoa.Models;
using ClasseCurso.Models;

Pessoa pessoa1 = new("Arthur");
pessoa1.Idade = 19;
pessoa1.Sobrenome = "Marzano";

Pessoa pessoa2 = new();
pessoa2.Nome = "Patrícia";
pessoa2.Idade = 20;
pessoa2.Sobrenome = "Correa";

Console.WriteLine(pessoa1.NomeCompleto);
Console.WriteLine(pessoa2.NomeCompleto);

Curso curso = new("Sexo");


Console.WriteLine(curso.Nome);