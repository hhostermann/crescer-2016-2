using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace StreetFighter.RepositorioFW
    {
        public class UsuarioRepositorioFW
        {
            public static List<Login> ListarUsuario()
            {
                using (var context = new DatabaseContext())
                {
                    return context.Username
                                  .ToList();
                }
            }
        }
 }
