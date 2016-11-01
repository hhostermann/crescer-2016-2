using StreetFighter.Models;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Controllers
{
    public class StreetFighterController : Controller
    {
        // GET: StreetFighter
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult FichaTecnica()
        {
            var model = new ModelFichaTecnica();
            model.PrimeiraAparicao = "Street Fighter II The World Warrior (1991)";
            model.DataNascimento = DateTime.Parse("12/02/1966", new CultureInfo("pt-BR")); 
            model.Altura = 192;
            model.Peso = 96;
            model.Medidas = "B198, C120, Q172";
            model.TipoSanguineo = 'B';
            model.HabilidadesEspeciais = "Caçar, Eletricidade";
            model.Gosta = "Frutas tropicais, Pirarucu, Sua mãe";
            model.Desgosta = "Army ants (espécie de formiga)";
            model.EstiloDeLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira";
            model.Origem = "Brasil (lugar de nascença é provável como sendo Tailândia)";
            model.FalaDeVitoria = "\"Ver você em ação é uma piada!\"";
            model.SSF2Nickname = "\"A selvagem criança da natureza\"";
            model.SFA3Nickname = "\"A animal pessoa amazônica\"";
            model.SF4Nickname = "\"Guerreiro da selva\"";
            model.SFA3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?)";
            model.SF2Stage = "Bacia do rio Amazonas (Brasil)";
            model.GolpesEspeciaisFamosos = "Electric Thunder, Rolling Attack";
            return View(model);
        }
        public ActionResult Sobre()
        {
            var model = new ModelSobre();
            model.PrimeiraAparicao = "Hospital de Taquara";
            model.DataNascimento = DateTime.Parse("11/11/1990", new CultureInfo("pt-BR"));
            model.Altura = 196;
            model.Peso = 99;
            model.Medidas = "sem ideia";
            model.TipoSanguineo = "O+";
            model.HabilidadesEspeciais = "Comer, Dormir, ver séries.";
            model.Gosta = "BACON, BACON, BACON";
            model.EstiloDeLuta = "Falar sobre TI (afasta 80% das pessoas)";
            model.Origem = "Taquara - RS - Brasil";
            model.FalaDeVitoria = "GG!!";
            model.WowNickname = "Soobored";
            model.SteanNickname = "hhostermann";
            model.Estilo = "suporte, Tank";
            return View(model);
        }
    }
}