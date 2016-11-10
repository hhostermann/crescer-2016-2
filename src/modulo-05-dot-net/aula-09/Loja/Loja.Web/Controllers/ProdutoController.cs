using AutoMapper;
using Loja.Dominio;

using Loja.Web.Models;
using Loja.Web.Servicos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class ProdutoController : Controller
    {
        
        public ActionResult Listar(string nome = null)
        {
            var produtoServico = ServicoDeDependencias.MontarProdutoServico();
            IList<Produto> produtos = produtoServico.ListarProduto(nome);

            return View("ListaProduto", produtos);
        }

        public ActionResult Excluir(int id)
        {

            var produtoServico = ServicoDeDependencias.MontarProdutoServico();
            produtoServico.ExcluirProduto(id);

            return RedirectToAction("Listar");
        }
        
        public ActionResult Inserir()
        {
            return View("AlterarProduto");
        }
        
        public ActionResult Editar(int id)
        {

            ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
            Produto produto = produtoServico.BuscarProdutoId(id);
            ProdutoModel produtoModel = Mapper.Map<Produto, ProdutoModel>(produto);

            return View("AlterarProduto", produtoModel);
        }
        
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Salvar(ProdutoModel produtoModel)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    Produto produto = Mapper.Map<ProdutoModel, Produto>(produtoModel);
                    ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
                    produtoServico.ValidarProduto(produto);

                    return RedirectToAction("Listar");
                }
            }
            catch (ProdutoException e)
            {
                ModelState.AddModelError("", e.Message);
                return View("AlterarProduto", produtoModel);
            }


            ModelState.AddModelError("", "Ocorreu um erro no preenchimento do formulário.");
            return View("AlterarProduto", produtoModel);
        }

    }
}