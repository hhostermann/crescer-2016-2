using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Repositorio
{
    public class UsuarioRepositorio
    {
        public static List<Login> ListaUsuario()
        {
            var CaminhoArquivo = @"C:\Users\henrique.ostermann\henrique.ostermann\src\Modulo-05-C#\StreetFighter\Usuario.csv";
            var lista = new List<Login>();
            var usuario = File.ReadLines(CaminhoArquivo);
            foreach (var user in usuario)
            {
                var parametro = user.Split(';');
                Login l = new Login()
                {
                    Username = parametro[0],
                    Senha = parametro[1]
                };
                var listaPermissao = new List<string>();
                for (int i = 2; i < parametro.Count(); i++)
                {
                    listaPermissao.Add(parametro[i]);
                }
                l.Permissao = listaPermissao.ToArray();
                lista.Add(l);
            }
            return lista;
        }
               
        }
    
}
