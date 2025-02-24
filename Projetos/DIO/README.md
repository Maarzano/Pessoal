# 🎬 Consultas SQL - Bootcamp DIO  

Este README contém um conjunto de **consultas SQL** realizadas como parte de uma atividade do **Bootcamp da DIO**.  

## 📌 Tecnologias Utilizadas  
- **Banco de Dados Relacional (SQL)**  
- **SGBD Compatíveis**: MySQL, PostgreSQL, SQL Server, SQLite  
- **Principais Comandos SQL**: `SELECT`, `WHERE`, `ORDER BY`, `JOIN`, `GROUP BY`, `COUNT()`, `BETWEEN`, etc.  

## 📜 Consultas SQL  

```sql
-- 1 Buscar o nome e ano dos filmes  
SELECT Nome, Ano FROM Filmes;  

-- 2 Buscar o nome e ano dos filmes, ordenados por ordem crescente pelo ano  
SELECT Nome, Ano, Duracao  
FROM Filmes  
ORDER BY Ano;  

-- 3 Buscar pelo filme "De Volta para o Futuro", trazendo o nome, ano e a duração  
SELECT Nome, Ano, Duracao  
FROM Filmes  
WHERE Nome = 'De Volta para o Futuro';  

-- 4 Buscar os filmes lançados em 1997  
SELECT Nome, Ano, Duracao  
FROM Filmes  
WHERE Ano = '1997';  

-- 5 Buscar os filmes lançados APÓS o ano 2000  
SELECT *  
FROM Filmes  
WHERE Ano > '2000';  

-- 6 Buscar os filmes com duração maior que 100 e menor que 150, ordenando pela duração em ordem crescente  
SELECT *  
FROM Filmes  
WHERE Duracao BETWEEN 101 AND 149  
ORDER BY Duracao;  

-- 7 Buscar a quantidade de filmes lançados no ano, agrupando por ano, ordenando pela quantidade em ordem decrescente  
SELECT Ano, COUNT(*) AS Quantidade  
FROM Filmes  
GROUP BY Ano  
ORDER BY Quantidade DESC;  

-- 8 Buscar os atores do gênero masculino, retornando o PrimeiroNome e UltimoNome  
SELECT PrimeiroNome, UltimoNome  
FROM Atores  
WHERE Genero = 'M';  

-- 9 Buscar os atores do gênero feminino, retornando o PrimeiroNome, UltimoNome e ordenando pelo PrimeiroNome  
SELECT PrimeiroNome, UltimoNome  
FROM Atores  
WHERE Genero = 'F'  
ORDER BY PrimeiroNome;  

-- 10 Buscar o nome do filme e o gênero  
SELECT f.Nome AS Filme, g.Genero AS Genero  
FROM Filmes AS f  
JOIN FilmesGenero AS fg ON f.Id = fg.IdFilme  
JOIN Generos AS g ON fg.IdGenero = g.Id;  

-- 11 Buscar o nome do filme e gênero "Mistério"  
SELECT f.Nome AS Filme, g.Genero AS Genero  
FROM Filmes AS f  
JOIN FilmesGenero AS fg ON f.Id = fg.IdFilme  
JOIN Generos AS g ON fg.IdGenero = g.Id  
WHERE g.Genero = 'Mistério';  

-- 12 Buscar o nome do filme e seus atores  
SELECT f.Nome AS Filme, a.PrimeiroNome, a.UltimoNome, ef.Papel  
FROM Filmes AS f  
JOIN ElencoFilme AS ef ON f.Id = ef.IdFilme  
JOIN Atores AS a ON ef.IdAtor = a.Id;  
