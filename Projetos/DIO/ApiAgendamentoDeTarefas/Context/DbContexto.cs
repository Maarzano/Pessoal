using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ApiAgendamentoDeTarefas.Entities;
using Microsoft.EntityFrameworkCore;

namespace ApiAgendamentoDeTarefas.Context {
    public class DbContexto : DbContext {
        public DbContexto(DbContextOptions<DbContexto> options) : base(options) { }

        public DbSet<Tarefa> Tarefas { get; set;}
        
    }
}