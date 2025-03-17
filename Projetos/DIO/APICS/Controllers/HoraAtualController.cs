using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using APIC_.Context;
using Microsoft.AspNetCore.Mvc;

namespace APIC_.Controllers
{
    [ApiController]
    [Route("[Controller]")]
    public class HoraAtualController : ControllerBase {
        
        [HttpGet("ObterHoraAtual")]
        public IActionResult ObterHora(){
            var hora = new {
                Hora = DateTime.Now.ToShortTimeString()
            };
            return Ok(hora);
        }
        
        
    }
}