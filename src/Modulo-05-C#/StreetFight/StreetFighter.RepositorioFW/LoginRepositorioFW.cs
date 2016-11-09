using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace StreetFighter.RepositorioFW
{
    namespace StreetFighter.RepositorioEF
    {
        public class UsuarioRepositorioEF
        {
            public static List<Login> ListaUsuarios()
            {
                using (var context = new DatabaseContext())
                {
                    return context.Usuario
                                  .ToList();
                }
            }
        }
    }
}