using StreetFighter.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Service
{
    public class ServicoAutenticacao
    {
        private const string USUARIO_LOGADO = "USUARIO_LOGADO";
        public static void Autenticar (ModelUsuarioLogado model)
        {
            HttpContext.Current.Session[USUARIO_LOGADO] = model;
        }
        public static ModelUsuarioLogado UsuarioLogado
        {
            get
            {
                return (ModelUsuarioLogado)HttpContext.Current.Session[USUARIO_LOGADO];
            }
        }
    }
}