using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using API1.Entities;
using Microsoft.EntityFrameworkCore;

namespace API1.Context {
    public class DbContexto : DbContext {
        public DbContexto(DbContextOptions<DbContexto> options) : base(options) { }

        public DbSet<Tarefa> Tarefas {get; set;}
        
    }
}