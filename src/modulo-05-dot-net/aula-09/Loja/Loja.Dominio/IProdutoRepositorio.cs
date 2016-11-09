﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public interface IProdutoRepositorio
    {
        List<Produto> ListarProduto(string nome);
        void IncluirProduto(Produto produto);
        void EditarProduto(Produto produto);
    }
}
