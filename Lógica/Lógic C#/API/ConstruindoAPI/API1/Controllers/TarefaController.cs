using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using API1.Context;
using API1.Entities;
using Microsoft.AspNetCore.Mvc;

namespace API1.Controllers {
    [ApiController]
    [Route("api/[controller]")]
    public class TarefaController : ControllerBase {
        private readonly DbContexto _contexto;

        public TarefaController(DbContexto contexto){
            _contexto = contexto;
        }

        [HttpPost]
        public IActionResult SetarTarefa(Tarefa tarefa){
            _contexto.Add(tarefa);
            _contexto.SaveChanges();
            return Ok(tarefa);

        }
        [HttpGet]
        public IActionResult PegarTarefas(){
            var Tarefas = _contexto.Tarefas.ToList();
            if (Tarefas == null) return NotFound();

            return Ok(Tarefas);
        }

        
    }
}