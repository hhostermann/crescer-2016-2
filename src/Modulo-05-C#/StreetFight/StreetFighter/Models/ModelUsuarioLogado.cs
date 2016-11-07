using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Models
{
    public class ModelUsuarioLogado
    {
        public ModelUsuarioLogado (string nome, string[] permissao = null)
        {
            this.Nome = nome;
            this.Permissao = permissao;
        }

        public string Nome { get; private set; }
        public string[] Permissao { get; private set; }
    }
}