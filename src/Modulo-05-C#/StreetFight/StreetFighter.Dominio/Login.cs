using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public class Login
    {
        public int Id { get; set; }
        public string Username { get; set; }
        public string Senha { get; set; }
        public string[] Permissao { get; set; }
    }
}
