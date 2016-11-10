using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class UsuarioRepositorio : IUsuarioRepositorio
    {
        public Usuario BuscarPorEmail(string email)
        {
            using (var context = new ContextoDeDados())
            {
                return context.Usuario.FirstOrDefault(u => u.Email.Equals(email));
            }
        }

        public void IncluirUsuario(Usuario usuario)
        {
            using (var context = new ContextoDeDados())
            {
                context.Entry<Usuario>(usuario).State = EntityState.Added;
                context.SaveChanges();
            }
        }
    }
}

