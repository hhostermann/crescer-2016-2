using StreetFighter.Dominio;
using StreetFighter.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Aplicativo
{
    public class AutenticacaoAplicativo
    {
        public static Login BuscarUsuario(string nome, string senha)
        {
            Login usuarioEncontrado = UsuarioRepositorio.ListaUsuario().ToArray().FirstOrDefault(usuario => usuario.Username.Equals(nome));
            string senhaComparar = Criptografia.ConverterMD5($"{nome}_$_{senha}");
            if (usuarioEncontrado != null && usuarioEncontrado.Senha.Equals(senhaComparar))
            {
                return usuarioEncontrado;
            }
            return null;
        }
    }
}
