using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ApiAgendamentoDeTarefas.Context;
using ApiAgendamentoDeTarefas.Entities;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using ApiAgendamentoDeTarefas.Models;

namespace ApiAgendamentoDeTarefas.Controllers
{
    [ApiController]
    [Route("[Controller]")]
    public class TarefaController : ControllerBase{
        private readonly DbContexto _contexto;
        public TarefaController(DbContexto contexto){
            _contexto = contexto;
        }

        [HttpPost]
        public IActionResult CriarTarefa(Tarefa tarefa){
            if (tarefa.Data == DateTime.MinValue)
                return BadRequest(new { Erro = "A data da tarefa não pode ser vazia" });
            _contexto.Add(tarefa);
            _contexto.SaveChanges();
            return CreatedAtAction(nameof(ObterTarefaPorId), new { id = tarefa.IdTarefa }, tarefa);
        }

        [HttpGet("ObterPorId/{Id}")]
        public IActionResult ObterTarefaPorId(int Id){
            var contexto = _contexto.Tarefas.FirstOrDefault(x => x.IdTarefa == Id);

            if (contexto == null) return NotFound();

            return Ok(contexto);
        }
        [HttpGet("ObterTodasTarefas")]
        public IActionResult ObterTodasTarefas(){
            var tarefas = _contexto.Tarefas.ToList();
            if (tarefas == null) return NotFound();

            return Ok(tarefas);
        }
        [HttpGet("ObterPorTitulo")]
        public IActionResult ObterTarefaPorTitulo(string titulo){
            var tarefa = _contexto.Tarefas.Where(x => x.Titulo.Contains(titulo));

            if (tarefa == null) return NotFound();

            return Ok(tarefa);
        }
        [HttpGet("ObterPorData")]
        public IActionResult ObterTarefaPorData(DateTime data){
            var tarefa = _contexto.Tarefas.Where(x => x.Data.Date == data.Date).ToList();

            if (!tarefa.Any()) return NotFound();

            return Ok(tarefa);
        }
        [HttpGet("ObterPorStatus")]
        public IActionResult ObterTarefaPorStatus(TarefaStatus status){
            var tarefa = _contexto.Tarefas.Where(x => x.Status.Equals(status));

            if (tarefa == null) return NotFound();

            return Ok(tarefa);

        }
        [HttpPut("{id}")]
        public IActionResult AtualizarTarefa(int id, Tarefa tarefa){
            var tarefas = _contexto.Tarefas.Find(id);

            if (tarefa == null) return NotFound();

            if (tarefa.Data == DateTime.MinValue)
                return BadRequest(new { Erro = "A data da tarefa não pode ser vazia" });

            tarefas.Titulo = tarefa.Titulo;
            tarefas.Data = tarefa.Data;
            tarefas.Descricao = tarefa.Descricao;
            tarefas.Status = tarefa.Status;

            _contexto.SaveChanges();
            return Ok(tarefa);
        }
        [HttpDelete]
        public IActionResult DroparTarefaPorId(int id){
            var tarefa = _contexto.Tarefas.Find(id);

            if (tarefa == null) return NotFound();
            _contexto.Remove(tarefa);
            _contexto.SaveChanges();
            return NoContent();
        }

    }
        
}