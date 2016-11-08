using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.RepositorioFW
{
    public class PersonagemRepositorioFW : IPersonagemRepositorio
    {
        public List<Personagem> ListarPersonagem(string filtroNome)
        {
            using (var context = new DatabaseContext())
            {
                return context.Personagem.ToList();
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
           
        }
        public void EditarPersonagem(Personagem personagem)
        {

        }
        public bool ExcluirPersonagem(Personagem personagem)
        {
            return false;
        }
    }
}