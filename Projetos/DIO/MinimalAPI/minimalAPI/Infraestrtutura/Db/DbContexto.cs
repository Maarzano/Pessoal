using Microsoft.EntityFrameworkCore;
using minimalAPI.Domain.Entities;
using Microsoft.Extensions.Configuration;

namespace minimalAPI.Infraestrtutura.Db
{
    public class DbContexto(IConfiguration configuracaoAppSettings) : DbContext
    {
        private readonly IConfiguration _configuracaoAppSettings = configuracaoAppSettings;
        public DbSet<Administrador> Administradores { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            var stringConexao = _configuracaoAppSettings.GetConnectionString("ConexaoPadrao")?.ToString();
            if (!string.IsNullOrEmpty(stringConexao)){
                optionsBuilder.UseSqlServer(stringConexao);
            }
        }
    }
}