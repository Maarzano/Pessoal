using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using System.Linq;
using System.Threading.Tasks;
using API2.Entities;

namespace API2.Context {
    public class DbContexto : DbContext {
        public DbContexto(DbContextOptions<DbContexto> options) : base(options) { }

        public DbSet<Livro> Livros {get; set;}
        
    }
}