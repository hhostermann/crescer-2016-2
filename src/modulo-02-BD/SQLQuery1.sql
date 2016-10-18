-- 01
select * from Pedido
select DataPedido , count(*) as TotalPedidos 
from Pedido
where month(convert(Date,DataPedido,103)) = 09 and 
year(convert(DateTime,DataPedido,103)) = 2015 
GROUP BY DataPedido	

-- 02
select p.IDProduto, p.Nome
from ProdutoMaterial pm
inner join Produto p on pm.IDProduto = p.IDProduto
group by p.IDProduto, p.Nome, pm.IDMaterial
having pm.IDMaterial = 15836;

-- 03
select Nome, RazaoSocial
from Cliente
where Nome like '%Ltda%' OR 
RazaoSocial like '%Ltda%';

-- 04
insert into Produto (Nome, PrecoCusto, PrecoVenda, Situacao) 
values ('Galocha Maragato', 35.67, 77.95, 'A');

-- 05
select p.IDProduto, p.Nome
from Produto p
left join PedidoItem pp on p.IDProduto = pp.IDProduto
where pp.IDProduto is null;
 
--6--
select top 1 with ties c.UF, count(*) as QuantidadeClientes
from Cidade c
inner join Cliente cl on c.IDCidade = cl.IDCidade
group by c.UF
order by QuantidadeClientes asc

select top 1 with ties c.UF, count(*) as QuantidadeClientes
from Cidade c
inner join Cliente cl on c.IDCidade = cl.IDCidade
group by c.UF
order by QuantidadeClientes desc

--8--
select p.Nome
from Produto p
left join ProdutoMaterial pm on p.IDProduto = pm.IDProduto
where pm.IDProduto is null;

--9--
select top 1 with ties Substring(Nome, 1, Charindex(' ', Nome) -1) as NomePopular,
count(*) as NomeIgual
from Cliente
group by Substring(Nome, 1, Charindex(' ', Nome) -1)
having count(*) > 1
order by NomeIgual desc