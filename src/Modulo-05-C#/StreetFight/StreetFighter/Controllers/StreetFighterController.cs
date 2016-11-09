using StreetFighter.Aplicativo;
using StreetFighter.Dominio;
using StreetFighter.Models;
using StreetFighter.Service;
using System;
using System.Collections.Generic;
using System.Globalization;
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
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult FazerLogin(string login, string senha)
        {
            Login usuarioAutenticado = AutenticacaoAplicativo.BuscarUsuario(login, senha);

            if (usuarioAutenticado  != null)
            {
                ServicoAutenticacao.Autenticar(new ModelUsuarioLogado(usuarioAutenticado.Username, usuarioAutenticado.Permissao));
                return RedirectToAction("Index");
            }
            return RedirectToAction("Login");
        }
        public ActionResult Login()
        {
            return View();
        }

        [HttpGet]
        public ActionResult Excluir(int idPersonagem)
        {
            var aplicativo = new PersonagemAplicativo();
            var personagem = aplicativo.BuscarId(idPersonagem);
            aplicativo.Excluir(personagem);
            TempData["Mensagem"] = "Personagem Excluido!";
            return RedirectToAction("ListarPersonagem");
        }
        public ActionResult ListarPersonagem(ModelFichaTecnica personagem = null, string filtroNome = null)
        {
            if (ModelState.IsValid || personagem == null || personagem.Nome == null)
            {
                try
                {
                    var aplicativo = new PersonagemAplicativo();
                    if (personagem != null && personagem.Nome != null)
                    {
                        aplicativo.Salvar(this.ToPersonagem(personagem));
                    }
                    var model = new PersonagemAplicativo().ListarPersonagem(filtroNome);
                    return View(model);
                }

                catch (RegraNegocioException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
                ViewData["ListaOrigem"] = this.ListaOrigem();
                return View("Cadastro", personagem);
            }
            else
            {
                return RedirectToAction("Cadastro");
            }
        }
        [HttpGet]
        public ActionResult FichaTecnica(int id= 0 )
        {
            Personagem character = new PersonagemAplicativo().BuscarId(id);
            if (character != null)
            {
                return View(this.ToModelFichaTecnica(character));
            }
            else
            {
                return RedirectToAction("ListarPersonagem");
            }
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
        
        public ActionResult Cadastro(int id = 0)
        {
            ViewData["ListaOrigem"] = this.ListaOrigem();
            var personagem = new PersonagemAplicativo().BuscarId(id);
            if (personagem == null)
            {
                return View(new ModelFichaTecnica() { Id = 0 });
            }
            else
            {
                TempData["Mensagem"] = "Personagem Editado!";
                return View(this.ToModelFichaTecnica(personagem));
            }
        }
        private Personagem ToPersonagem(ModelFichaTecnica model)
        {
            return new Personagem(
                model.Id,
                model.Nome,
                model.Nascimento,
                model.Altura,
                model.Origem,
                model.Peso,
                model.Imagem,
                model.GolpeEspecialFamoso,
                model.PersonagemOculto
                );
        }
        private ModelFichaTecnica ToModelFichaTecnica(Personagem personagem)
        {
            return new ModelFichaTecnica()
            {
                Id = personagem.Id,
                Nome = personagem.Nome,
                Nascimento = personagem.Nascimento,
                Altura = personagem.Altura,
                Peso = personagem.Peso,
                Origem = personagem.Origem,
                Imagem = personagem.Imagem,
                GolpeEspecialFamoso = personagem.GolpeEspecialFamoso,
                PersonagemOculto = personagem.PersonagemOculto
            };
        }
        private List<SelectListItem> ListaOrigem()
        {
            return new List<SelectListItem>()
            {
                new SelectListItem() {Value = "BRA", Text = "Brasil" },
                new SelectListItem() {Value = "EUA", Text = "Estados Unidos" },
                new SelectListItem() {Value = "ARG", Text = "Argentina" },
                new SelectListItem() {Value = "JPN", Text = "Japão" },
                new SelectListItem() {Value = "GER", Text = "Alemanha" },
                new SelectListItem() {Value = "GRE", Text = "Grécia" },
                new SelectListItem() {Value = "ITA", Text = "Itália" },
                new SelectListItem() {Value = "MDP", Text = "Morro Da Pedra" }

                };

        }
    }
}
           
        //    if (ModelState.IsValid)
        //    {

        //        ViewBag.Mennsagem = "Cadastro Feito Com Sucesso.";
        //        return View(model);
        //    }
        //    else
        //    {
        //        return View("Cadastro");
        //    }
        //}