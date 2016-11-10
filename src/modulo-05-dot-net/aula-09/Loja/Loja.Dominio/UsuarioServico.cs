using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class UsuarioServico
    {
        private IUsuarioRepositorio usuarioRepositorio;
        private IServicoDeCriptografia servicoCriptografia;

        public UsuarioServico(IUsuarioRepositorio usuarioRepositorio, IServicoDeCriptografia servicoCriptografia)
        {
            this.usuarioRepositorio = usuarioRepositorio;
            this.servicoCriptografia = servicoCriptografia;
        }

        public Usuario BuscarPorAutenticacao(Usuario usuario)
        {
            Usuario usuarioEncontrado = this.usuarioRepositorio.BuscarPorEmail(usuario.Email);

            string senhaCriptografada = this.servicoCriptografia.Criptografar(usuario.Senha);

            if (usuarioEncontrado != null && usuarioEncontrado.Senha.Equals(senhaCriptografada))
            {
                return usuarioEncontrado;
            }

            return null;
        }
        public void IncluirUsuario(Usuario usuario)
        {
            ValidarUsuario(usuario);
            usuarioRepositorio.IncluirUsuario(usuario);
        }
        private void ValidarUsuario(Usuario usuario)
        {
            bool invalidoEmail = usuario.Email.Length < 5;
            if (invalidoEmail)
            {
                throw new UsuarioException ($"E-mail invalido, e-mail deve ter no minimo 5 caracteres.");
            }
            Usuario encontradoUsuario = this.usuarioRepositorio.BuscarPorEmail(usuario.Email);
            bool emailCadastrado = usuarioRepositorio != null;
            if (emailCadastrado)
            {
                throw new UsuarioException ($"E-mail invalido, e-mail já em uso.");
            }
        }
    }
}