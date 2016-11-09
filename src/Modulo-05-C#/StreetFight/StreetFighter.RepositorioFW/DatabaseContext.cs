﻿using StreetFighter.Dominio;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;

namespace StreetFighter.RepositorioFW
{
    public class DatabaseContext : DbContext
    {
        public DatabaseContext() : base("StreetFighterConection")
        {

        }

        public DbSet<Personagem> Personagem { get; set; }
        public DbSet<Login> Usuario { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
}