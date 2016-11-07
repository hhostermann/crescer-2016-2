using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Models
{
    public class ModelUsuarioLogado
    {

        public string Nome { get; private set; }
        public string[] Permissao { get; private set; }
        public ModelUsuarioLogado (string nome, string[] permissao = null)
        {
            Nome = nome;
            Permissao = permissao;
        }

    }
}