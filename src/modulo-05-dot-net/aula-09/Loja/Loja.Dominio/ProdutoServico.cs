using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class ProdutoServico
    {
        private IProdutoRepositorio produtoRepositorio;
        public ProdutoServico(IProdutoRepositorio produtoRepositorio)
        {
            this.produtoRepositorio = produtoRepositorio;
        }
        public IList<Produto> ListarProduto(string nome = null)
        {
            return produtoRepositorio.ListarProduto(nome);
        }
        public Produto BuscarProdutoId(int id)
        {
            return produtoRepositorio.BuscarProdutoId(id);
        }
        public Produto BuscarProdutoNome(string nome)
        {
            return produtoRepositorio.BuscarProdutoNome(nome);
        }
        public void NomeDuplicado(Produto produto)
        {
            this.NomeDuplicado(produto);
            if (produto.Id == 0)
            {
                bool produtoExiste = this.BuscarProdutoNome(produto.Nome) != null;
                if (produtoExiste)
                {
                    throw new ProdutoException($"Este produto já foi cadastrado");
                }
                produtoRepositorio.IncluirProduto(produto);
            }
            else
            {
                produtoRepositorio.EditarProduto(produto);
            }
        }
        public void ExcluirProduto(int id)
        {
            Produto produto = produtoRepositorio.BuscarProdutoId(id);
            produtoRepositorio.ExcluirProduto(produto);
        }
        public void ValidarProduto(Produto produto)
        {
            bool validarNome = !String.IsNullOrEmpty(produto.Nome) && produto.Nome.Length >= 2;
            if (!validarNome)
            {
                throw new ProdutoException($"Nome incorreto, nome do produto deve ter no minimo 2 caracteres");
            }
            bool validarPreco = produto.Preco > 0;
            if (!validarPreco)
            {
                throw new ProdutoException($"Preco Incorreto, preco do produto deve ser maior que 0");
            }
        }
    }
}