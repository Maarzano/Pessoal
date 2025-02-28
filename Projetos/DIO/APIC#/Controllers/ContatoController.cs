using APIC_.Context;
using APIC_.Entities;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace APIC_.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class ContatoController : ControllerBase
    {
        private readonly AgendaContext _context;
        public ContatoController(AgendaContext context){
            _context = context;
        }
        [HttpPost]
        public IActionResult Create(Contato contato){
            _context.Add(contato);
            _context.SaveChanges();
            return Ok(contato);
        }

        [HttpGet("ObterTodosContatos")]
        public IActionResult GetAll(){
            var contatos = _context.Contatos.Include(c => c.Enderecos).ToList();
            return Ok(contatos);
        }

        [HttpGet("ObterContatoPorId/{id}")]
        public IActionResult ObertPorID(int id){
            var contato = _context.Contatos.Include(c => c.Enderecos).FirstOrDefault(c => c.IdContato == id);
            if (contato == null) return NotFound();

            return Ok(contato);
        }
        [HttpGet("ObterPorNome/{nome}")]
        public IActionResult ObterContatoPorNome(string nome){
            var contatos = _context.Contatos.Where(x => x.Nome.Contains(nome));
            return Ok(contatos);
        }

        [HttpPut("AtualizarPorId/{id}")]
        public IActionResult Atualizar(int id, Contato contato){

            var contatoBanco = _context.Contatos.Find(id);

            if (contato == null) return NotFound();

            contatoBanco.Nome = contato.Nome;
            contatoBanco.Ativo = contato.Ativo;
            contatoBanco.Telefone = contato.Telefone;
            _context.Contatos.Update(contatoBanco);
            _context.SaveChanges();
            return Ok(contato);
        }

        [HttpDelete("DeletarPorId/{id}")]
        public IActionResult DeletarContato(int id){
            var contato = _context.Contatos.Find(id);
            if (contato == null) return NotFound();

            _context.Contatos.Remove(contato);
            _context.SaveChanges();
            return NoContent();
        }
    }
}