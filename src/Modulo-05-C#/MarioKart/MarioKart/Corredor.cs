using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart
{
    public class Corredor
    {
        public Corredor(string nome, NivelCorredor nivelCorredo)
        {
            this.Nome = nome;
            this.NivelCorredor = nivelCorredor;

    }
     public string Nome { get; private set; }

    }
}
{ public abstract class Personagem
{
    public Personagem(int vidaInicial)
    {
        this.Vida = vidaInicial;
        this.Equipamentos = new List<IEquipamento>();
    }

    protected List<IEquipamento> Equipamentos { get; set; }

    public int Vida { get; private set; }

    private int ataque;
    public virtual int Ataque
    {
        get
        {
            int bonusDosEquipamentos = 0;

            foreach (IEquipamento equipamento in this.Equipamentos)
            {
                bonusDosEquipamentos += equipamento.BonusDeAtaque;
            }

            return this.ataque + bonusDosEquipamentos;
        }

        protected set
        {
            this.ataque = value;
        }
    }
    public int Defesa { get; protected set; }

    public void Equipar(IEquipamento equipamento)
    {
        this.Equipamentos.Add(equipamento);
    }

    public void Atacar(Personagem personagem)
    {
        personagem.ReceberAtaque(this.Ataque);
    }

    protected virtual void ReceberAtaque(int ataque)
    {
        this.Vida -= ataque;
    }
}
}