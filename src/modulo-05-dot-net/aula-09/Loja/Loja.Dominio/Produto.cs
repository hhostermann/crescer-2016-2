using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class Produto
    {
        public Produto()
        {

        }
        public int Id { get; set; }
        public string Nome { get; set; }
        public decimal Preco { get; set; }

        public override bool Equals(object objeto)
        {
            var item = objeto as Produto;

            if (item == null)
            {
                return false;
            }

            return this.Id.Equals(item.Id);
        }
    }
}
