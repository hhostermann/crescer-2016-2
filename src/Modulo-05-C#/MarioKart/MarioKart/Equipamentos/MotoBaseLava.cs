﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Equipamentos
{
    class MotoBaseLava : IEquipamento
    {
        public int BonusVelocidade
        {
            get
            {
                return 3;
            }
        }
    }
}
