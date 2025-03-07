using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using API2.Context;
using API2.Entities;
using API2.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using Microsoft.VisualBasic;

namespace API2.Controllers {
    [ApiController]
    [Route("[controller]")]
    public class LivroController : ControllerBase {
        private readonly DbContexto _contexto;
        public LivroController(DbContexto contexto){
            _contexto = contexto;

        }

        [HttpGet("ListarTodosOsLivros")]
        public IActionResult Get(){
            var livro = _contexto.Livros.ToList();

            if (!livro.Any()) return NotFound();

            return Ok(livro);
        }

        [HttpPost("AdicionarLivro")]
        public IActionResult Post(Livro contexto){
            _contexto.Add(contexto);
            _contexto.SaveChanges();
            return Ok(contexto);
        }

        [HttpGet("{id}")]
        public IActionResult GetById(int id){
            var livro = _contexto.Livros.FirstOrDefault(L => L.Id == id);

            if (livro == null) return NotFound();

            return Ok(livro);
        }

        [HttpPut("{id}")]
        public IActionResult UpdateById(int id, [FromBody] Livro livroAtualizado){

            var livro = _contexto.Livros.FirstOrDefault(L => L.Id == id);

            if (livro == null) return NotFound();

            livro.Título = livroAtualizado.Título;
            livro.Autor = livroAtualizado.Autor;
            livro.AnoPublicação = livroAtualizado.AnoPublicação;
            livro.Genero = livroAtualizado.Genero;
            livro.QuantidadeDisponível = livroAtualizado.QuantidadeDisponível;

            _contexto.SaveChanges();
            return Ok(livro);

        }

        [HttpDelete("{id}")]
        public IActionResult DeleteById(int id){

            var livro = _contexto.Livros.FirstOrDefault(L => L.Id == id);
            if (livro == null) return NotFound();

            _contexto.Remove(livro);
            _contexto.SaveChanges();

            return Ok();
        }

        [HttpGet("BuscarPorAutor/{autor}")]
        public IActionResult GetBookByAutor(string autor){
            var livro = _contexto.Livros.Where(L => L.Autor.Contains(autor)).ToList();

            if (!livro.Any()) return NotFound();

            return Ok(livro);

        }

        [HttpGet("BuscarPorGenero/{genero}")]
        public IActionResult GetBookByGender(GeneroLivroEnum genero){
            var livro = _contexto.Livros.Where(L => L.Genero == genero).ToList();

            if (!livro.Any()) return NotFound();

            return Ok(livro);
        }

        [HttpGet("BuscarPorDisponível")]
        public IActionResult GetBookByAvaible(){
            var livro = _contexto.Livros.Where(L => L.QuantidadeDisponível > 0).ToList();

            if (livro.IsNullOrEmpty()) return NotFound();

            return Ok(livro);
        }
        
    }
}