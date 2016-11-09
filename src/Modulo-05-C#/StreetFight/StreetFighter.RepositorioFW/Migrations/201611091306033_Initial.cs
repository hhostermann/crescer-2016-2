namespace StreetFighter.RepositorioFW.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Personagem",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(),
                        Nascimento = c.DateTime(nullable: false),
                        Altura = c.Int(nullable: false),
                        Origem = c.String(),
                        Peso = c.Decimal(nullable: false, precision: 18, scale: 2),
                        Imagem = c.String(),
                        GolpeEspecialFamoso = c.String(),
                        PersonagemOculto = c.Boolean(nullable: false),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Login",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Username = c.String(),
                        Senha = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
        }
        
        public override void Down()
        {
            DropTable("dbo.Login");
            DropTable("dbo.Personagem");
        }
    }
}
