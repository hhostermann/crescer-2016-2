﻿using StreetFighter.Dominio;
using StreetFighter.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Aplicativo
{
    
    public class PersonagemAplicativo
    {
        private readonly IPersonagemRepositorio repositorio;

        public PersonagemAplicativo()
        {
            this.repositorio = new PersonagemRepositorio();
        }

        internal PersonagemAplicativo(IPersonagemRepositorio repositorio)
        {
            this.repositorio = repositorio;
        }

        public List<Personagem> ListarPersonagem(string filtroNome = null)
        {
            return new PersonagemRepositorioBDD().ListarPersonagem(filtroNome);
        }

        public void Salvar (Personagem personagem)
        {
            if (personagem.Id == 0)
            {
                repositorio.IncluirPersonagem(personagem);
            }
            else
            {
                repositorio.EditarPersonagem(personagem);
            }
        }
        public void Excluir(Personagem personagem)
        {
            this.repositorio.ExcluirPersonagem(personagem);
        }
        public Personagem BuscarId(int idPersonagem)
        {
            return this.ListarPersonagem().Find(personagem => personagem.Id == idPersonagem);
        }
    }
}
