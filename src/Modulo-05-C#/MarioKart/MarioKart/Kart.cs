using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart
{
    class Kart
    {
        public Kart(Corredor corredor)
        {
            this.Corredor = corredor;
        }

        public Corredor Corredor { get; private set; }
        public int Velocidade {
            get
            {

            }; private set;
        }
        public int SomaVelocidade()
        {
            Velocidade = 3; 

        }
    }
}
