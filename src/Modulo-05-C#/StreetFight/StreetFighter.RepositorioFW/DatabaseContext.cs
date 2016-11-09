using StreetFighter.Dominio;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;

namespace StreetFighter.RepositorioFW
{
    public class DatabaseContext : DbContext
    {
        public DatabaseContext() : base("StreetFighter")
        {

        }

        public DbSet<Personagem> Personagem { get; set; }
        public DbSet<Login> Username { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
}