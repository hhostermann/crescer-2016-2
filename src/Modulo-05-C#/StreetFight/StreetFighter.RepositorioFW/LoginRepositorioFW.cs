using StreetFighter.Dominio;
using StreetFighter.Aplicativo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.RepositorioFW
{
    public class LoginRepositorioFW : ILoginRepositorio
        {

            public Login BuscarUsuario(string nome, string senha)
            {
                string senhaComparacao =
                    Criptografia.ConverterMD5($"{nome}_$_{senha}");

                using (var context = new DatabaseContext())
                {

                    Login usuario = context.Usuario.FirstOrDefault(u => u.Nome.Equals(nome) && u.Senha.Equals(senhaComparacao));
                    return usuario;
                }
            }
        }
    }
