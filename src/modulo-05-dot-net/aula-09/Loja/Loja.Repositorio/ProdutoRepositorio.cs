using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class ProdutoRepositorio : IProdutoRepositorio
    {
        public List<Produto> ListarProduto(string nome)
        {
            using (var context = new ContextoDeDados())
            {
                var lista = context.Produto
                                   .Where(p => nome == null || nome.Equals("") || p.Nome.ToUpper().Contains(nome.ToUpper()))
                                   .ToList();
                return lista;
            }
        }
        public void IncluirProduto(Produto produto)
        {
            using (var context = new ContextoDeDados())
            {
                context.Entry<Produto>(produto).State = EntityState.Added;
                context.SaveChanges();
            }
        }

        public void EditarProduto(Produto produto)
        {
            using (var context = new ContextoDeDados())
            {
                context.Entry<Produto>(produto).State = EntityState.Modified;
                context.SaveChanges();
            }
        }
    }
}