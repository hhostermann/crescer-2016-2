using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
namespace StreetFighter.Models
{
    public class ModelFichaTecnica
    {
        public int Id { get; set; }
        [Required]
        [DisplayName("URL Imagem")]
        public string Imagem { get; set; }
        [Required]
        [DisplayName("Nome")]
        public string Nome { get; set; }
        [Required]
        [DisplayName("Data de Nascimento")]
        public DateTime Nascimento { get; set; }
        [Required]
        [DisplayName("Altura")]
        public int Altura { get; set; }
        public string Origem { get; set; }
        [Required]
        [DisplayName("Peso")]
        [Range(0.0, 1000.0, ErrorMessage = "Peso Errado, Vá pra balança e escreva corretamente")]
        public decimal Peso { get; set; }
        [Required]
        [DisplayName("Golpe Especial")]
        public string GolpeEspecialFamoso { get; set; }
        

        [DisplayName ("Personagem Oculto")]
        public bool PersonagemOculto { get; internal set; }
       
    }
    }