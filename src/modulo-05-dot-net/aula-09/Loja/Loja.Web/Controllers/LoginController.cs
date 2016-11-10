using Loja.Dominio;
using Loja.Infraestrutura;
using Loja.Repositorio;
using Loja.Web.Servicos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class LoginController : Controller
    {
        // GET: Login
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Entrar(Usuario usuario)
        {
            UsuarioServico usuarioServico = ServicoDeDependencias.MontarUsuarioServico();

            Usuario usuarios = usuarioServico.BuscarPorAutenticacao(usuario);

            if (usuarios != null)
            {
                return RedirectToAction("Listar", "Produto");
            }
            else
            {
                //ViewBag.Mennsagem = "Usuário ou senha inválida.";
                ModelState.AddModelError("login.invalido", "Usuário ou senha inválida.");
                return View("Index");
            }
        }
    }
}