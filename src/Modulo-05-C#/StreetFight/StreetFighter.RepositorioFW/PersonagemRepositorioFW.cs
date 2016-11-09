using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.RepositorioFW
{
    public class PersonagemRepositorioFW : IPersonagemRepositorio
    {
        public List<Personagem> ListarPersonagem(string filtro)
        {
            using (var context = new DatabaseContext())
            {
                var lista = context.Personagem
                                   .Where(p => filtro == null || filtro.Equals("") || p.Nome.ToUpper().Contains(filtro.ToUpper()))
                                   .ToList();
                return lista;
            }
        }

        public Personagem BuscarPersonagem(int id)
        {
            using (var context = new DatabaseContext())
            {
                return context.Personagem.Find(id);
            }
        }

        public void IncluirPersonagem(Personagem personagem)
        {
            using (var context = new DatabaseContext())
            {
                context.Entry<Personagem>(personagem).State = EntityState.Added;
                context.SaveChanges();
            }
        }

        public void EditarPersonagem(Personagem personagem)
        {
            using (var context = new DatabaseContext())
            {
                context.Entry<Personagem>(personagem).State = EntityState.Modified;
                context.SaveChanges();
            }
        }

        public void ExcluirPersonagem(Personagem personagem)
        {
            using (var context = new DatabaseContext())
            {
                context.Entry<Personagem>(personagem).State = EntityState.Deleted;
                context.SaveChanges();
            }
        }
    }
}





