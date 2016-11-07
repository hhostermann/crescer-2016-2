using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public class Personagem
    {
        public int Id { get; private set; }
        public string Nome { get; set; }
        public DateTime Nascimento { get; private set; }
        public int Altura { get; private set; }
        public string Origem { get; private set; }
        public decimal Peso { get; private set; }
        public string Imagem { get; private set; }
        public string GolpeEspecialFamoso { get; private set; }
        public bool PersonagemOculto { get; private set; }

        public Personagem (int id, string nome, DateTime nascimento, int altura, string origem, decimal peso, string imagem, string golpeEspecialFamoso, bool personagemOculto)
            : this(nome, nascimento, altura, origem, peso, imagem, golpeEspecialFamoso, personagemOculto)
        {
            this.Id = id;
        }
        public Personagem( string nome, DateTime nascimento, int altura, string origem, decimal peso, string imagem, string golpeEspecialFamoso, bool personagemOculto)
        {
            if (nome.ToUpperInvariant().Contains("NUNES"))
            {
                throw new RegraNegocioException("Não é permitido cadastrar personagem overpowered");
            }
            if (origem == "MDP")
            {
                throw new RegraNegocioException($"Somente um personagem pode ser dessa região e esse personagem não é o {nome}.");
            }
            this.Nome = nome;
            this.Nascimento = nascimento;
            this.Altura = altura;
            this.Origem = origem;
            this.Peso = peso;
            this.Imagem = imagem;
            this.GolpeEspecialFamoso = golpeEspecialFamoso;
            this.PersonagemOculto = personagemOculto;
        }
    }
}
