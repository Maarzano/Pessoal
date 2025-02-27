using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using APIC_.Entities;

namespace APIC_.Context {
    public class AgendaContext : DbContext {
        public AgendaContext(DbContextOptions<AgendaContext> options) : base(options){ }

        public DbSet<Contato> Contatos{get; set;}
        public DbSet<Produto> Produtos{get; set;}
        public DbSet<Endereco> Enderecos{get; set;}

        protected override void OnModelCreating(ModelBuilder modelBuilder) {
            modelBuilder.Entity<Endereco>().HasOne(e => e.Contato).WithMany(c => c.Enderecos).HasForeignKey(e => e.IdContato);
            modelBuilder.Entity<Produto>().HasOne(e => e.Contato).WithMany(c => c.Produtos).HasForeignKey(e => e.IdContato);
        }
    }
}