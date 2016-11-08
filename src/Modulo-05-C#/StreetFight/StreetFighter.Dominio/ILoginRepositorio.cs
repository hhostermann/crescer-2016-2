using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public interface ILoginRepositorio
    {
        Login BuscarUsuario(string nome, string senha);
    }
}
