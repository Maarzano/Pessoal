using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.VisualBasic;
using API2.Models;

namespace API2.Entities {
    public class Livro {
        [Key]
        public int Id { get; set; }
        [Required]
        public string Título { get; set; }
        [Required]
        public string Autor { get; set; }
        public DateOnly AnoPublicação { get; set; }
        public GeneroLivroEnum Genero { get; set; }
        
        [Range(0, int.MaxValue)]
        public int QuantidadeDisponível { get; set; }
        public DateTime DataCriação { get; set; } = DateTime.Now;
        
    }
}