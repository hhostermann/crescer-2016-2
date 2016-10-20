

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void adicionarItemNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.adicionarItem(espadaZ);
        assertTrue(inventario.getItem().contains(espadaZ));
    }
    @Test
    public void inventarioSemAdicionarItem() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        assertFalse(inventario.getItem().contains(espadaZ));
    }
    @Test
    public void adicionarDoisItensNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(botasDeFerro);
        assertTrue(inventario.getItem().contains(espadaZ));
        assertTrue(inventario.getItem().contains(botasDeFerro));
    }
    @Test
    public void adicionarCincoItensNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        assertTrue(inventario.getItem().contains(espadaZ));
        assertTrue(inventario.getItem().contains(botasDeFerro));
        assertEquals(5, inventario.getItem().size());
    }
    @Test
    public void adicionarItemNoInventarioEDepoisRemovelo() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.adicionarItem(espadaZ);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItem().contains(espadaZ));
    }
    @Test
    public void adicionarDoisItensNoInventarioERemoverApenasUm() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item bastaoMagico = new Item("Bastão Mágico", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(bastaoMagico);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItem().contains(espadaZ));
        assertTrue(inventario.getItem().contains(bastaoMagico));
    }
    @Test
    public void removerItemSemAdicionaloAntes() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItem().contains(espadaZ));
    }
    @Test
    public void getDescricoesItensComVariosItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga", 14));
        inventario.adicionarItem(new Item("Escudo", 2));
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Adaga, Escudo, Bracelete", inventario.getDescricoesItens());
    }
    @Test
    public void getDescricoesItensComApenasUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Bracelete", inventario.getDescricoesItens());
    }
    @Test
    public void getDescricoesItensSemItens() {
        Inventario inventario = new Inventario();
        assertEquals("", inventario.getDescricoesItens());
    }
    @Test
    public void aumentar1000UnidadesDosItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga", 14));
        inventario.adicionarItem(new Item("Escudo", 2));
        inventario.adicionarItem(new Item("Bracelete", 56));
        inventario.AumentarQuantidadeItens(1000);
        assertEquals(1014, inventario.getItem().get(0).getQuantidade());
        assertEquals(1002, inventario.getItem().get(1).getQuantidade());
        assertEquals(1056, inventario.getItem().get(2).getQuantidade());
    }
    @Test
    public void ordenarItensBaguncadosASCENDENTE() {
         
        Inventario inventario = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        inventario.adicionarItem(armadura);
        inventario.adicionarItem(escudo);
        inventario.adicionarItem(canivete);
        
        inventario.ordenarItens(TipoOrdenacao.ASCENDENTE);
        
        assertEquals(canivete, inventario.getItem().get(0));
        assertEquals(armadura, inventario.getItem().get(1));
        assertEquals(escudo, inventario.getItem().get(2));
    }
        @Test
    public void ordenarItensBaguncadosDESCENDENTE() {
         
        Inventario inventario = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        inventario.adicionarItem(armadura);
        inventario.adicionarItem(escudo);
        inventario.adicionarItem(canivete);
        
        inventario.ordenarItens(TipoOrdenacao.DESCENDENTE);
        
        assertEquals(canivete, inventario.getItem().get(2));
        assertEquals(armadura, inventario.getItem().get(1));
        assertEquals(escudo, inventario.getItem().get(0));
    }
        @Test
    public void buscarDescricaoItem() {
         
        Inventario inventario = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        inventario.adicionarItem(armadura);
        inventario.adicionarItem(escudo);
        inventario.adicionarItem(canivete);
        
        
        
        assertEquals(armadura, inventario.buscar("Armadura"));
    }
    @Test
    public void mediaDeTresItens(){
        Inventario inventario = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        inventario.adicionarItem(armadura);
        inventario.adicionarItem(escudo);
        inventario.adicionarItem(canivete);
        assertEquals(36, inventario.getMediaQuantidades(), 0.);
    }
    @Test
    public void testeDoExercicio(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada", 3));
        inventario.adicionarItem(new Item("Poção HP", 4));
        inventario.adicionarItem(new Item("Lança", 2));
        assertEquals(3, inventario.getMediaQuantidades(), 0.);
    }
    @Test
    public void SomarQuantidadesTresItens(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada", 5));
        inventario.adicionarItem(new Item("Poção HP", 6));
        inventario.adicionarItem(new Item("Lança", 6));
        assertEquals(17, inventario.getSomatorioQuantidades());
    }
        public void unir2Inventarios2Itens(){
        Inventario inventario = new Inventario();
        Inventario inventario2 = new Inventario();
        inventario.adicionarItem(new Item("Espada", 1));
        inventario2.adicionarItem(new Item("Poção HP", 11));
        inventario2.adicionarItem(new Item("Lança", 3));
        Inventario resultado = inventario.unir(inventario2);
        assertEquals("Espada", resultado.getItem().get(0).getDescricao());
        assertEquals("Poção", resultado.getItem().get(1).getDescricao());
        assertEquals("Lança", resultado.getItem().get(2).getDescricao());
    }
        @Test
    public void diferenciar2InventariosPorTamanho(){
        Inventario inventario = new Inventario();
        Inventario inventario2 = new Inventario();
        Item item1 = new Item("Espada", 4);
        Item item2 = new Item("Poção HP", 12);
        Item item3 = new Item("Lança", 4);
        inventario.adicionarItem(item1);
        inventario.adicionarItem(item2);
        inventario2.adicionarItem(item1);
        inventario2.adicionarItem(item3);
        
        Inventario resultado = inventario.diferenciar(inventario2);
        assertEquals(1, resultado.getItem().size());
    }
        @Test
    public void cruzar2InventariosPorTamanho2EmComum(){
        Inventario inventario = new Inventario();
        Inventario inventario2 = new Inventario();
        Item item1 = new Item("Espada", 4);
        Item item2 = new Item("Poção HP", 12);
        Item item3 = new Item("Lança", 4);
        inventario.adicionarItem(item1);
        inventario.adicionarItem(item2);
        inventario2.adicionarItem(item1);
        inventario2.adicionarItem(item3);
        
        Inventario resultado = inventario.cruzar(inventario2);
        assertEquals(1, resultado.getItem().size());
    }
<<<<<<< HEAD

    @Test 
    public void aumentar1000UnidadesDosItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesItens(1000); 
        assertEquals(1002, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(1045, inventario.getItens().get(1).getQuantidade()); 
    } 
     
    @Test 
    public void aumentar1UnidadeItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesItens(1); 
        assertEquals(3, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(46, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(4, inventario.getItens().get(2).getQuantidade()); 
    } 
     
    @Test 
    public void aumentar0UnidadeItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesItens(0); 
        assertEquals(2, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(45, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(3, inventario.getItens().get(2).getQuantidade()); 
    } 
     
    @Test 
    public void aumentarUnidadeSemItens() { 
        Inventario inventario = new Inventario(); 
        inventario.aumentarUnidadesItens(1000); 
        assertEquals(0, inventario.getItens().size()); 
    } 
 
    private Inventario criarInventarioCom3Itens() { 
        Inventario inventario = new Inventario(); 
        inventario.adicionarItem(new Item("Espada de aço", 2)); 
        inventario.adicionarItem(new Item("Poção polissuco", 45)); 
        inventario.adicionarItem(new Item("Lucky egg", 3)); 
        return inventario; 
    } 

    @Test 
    public void ordenarItensDescendenteComItensOrdenadosAscendente() { 
        // Arrange 
        Inventario mochila = new Inventario(); 
        Item elderScroll = new Item("Elder Scroll", 1); 
        Item escudo = new Item("Escudo", 2); 
        Item canivete = new Item("Canivete suíço", 3); 
        mochila.adicionarItem(elderScroll); 
        mochila.adicionarItem(escudo); 
        mochila.adicionarItem(canivete); 
        // Act 
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE); 
        // Assert 
        assertEquals(canivete, mochila.getItens().get(0)); 
        assertEquals(escudo, mochila.getItens().get(1)); 
        assertEquals(elderScroll, mochila.getItens().get(2)); 
    } 
     
    @Test 
    public void ordenarItensDescendenteComItensMesmaQuantidade() { 
        // Arrange 
        Inventario mochila = new Inventario(); 
        Item elderScroll = new Item("Elder Scroll", 1); 
        Item escudo = new Item("Escudo", 1); 
        Item canivete = new Item("Canivete suíço", 1); 
        mochila.adicionarItem(elderScroll); 
        mochila.adicionarItem(escudo); 
        mochila.adicionarItem(canivete); 
        // Act 
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE); 
        // Assert 
        assertEquals(elderScroll, mochila.getItens().get(0)); 
        assertEquals(escudo, mochila.getItens().get(1)); 
        assertEquals(canivete, mochila.getItens().get(2)); 
    } 
     
    @Test 
    public void ordenarItensDescendenteJaOrdenado() { 
        // Arrange 
        Inventario mochila = new Inventario(); 
        Item elderScroll = new Item("Elder Scroll", 3); 
        Item escudo = new Item("Escudo", 2); 
        Item canivete = new Item("Canivete suíço", 1); 
        mochila.adicionarItem(elderScroll); 
        mochila.adicionarItem(escudo); 
        mochila.adicionarItem(canivete); 
        // Act 
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE); 
        // Assert 
        assertEquals(elderScroll, mochila.getItens().get(0)); 
        assertEquals(escudo, mochila.getItens().get(1)); 
        assertEquals(canivete, mochila.getItens().get(2)); 
    } 

    @Test
    public void adicionarCincoItensNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        assertTrue(inventario.getItens().contains(espadaZ));
        assertTrue(inventario.getItens().contains(botasDeFerro));
        assertEquals(5, inventario.getItens().size());
    }

    @Test
    public void adicionarItemNoInventarioEDepoisRemovelo() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.adicionarItem(espadaZ);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void adicionarDoisItensNoInventarioERemoverApenasUm() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item bastaoMagico = new Item("Bastão Mágico", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(bastaoMagico);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
        assertTrue(inventario.getItens().contains(bastaoMagico));
    }

    @Test
    public void removerItemSemAdicionaloAntes() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void getDescricoesItensComVariosItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga", 14));
        inventario.adicionarItem(new Item("Escudo", 2));
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Adaga,Escudo,Bracelete", inventario.getDescricoesItens());
    }

    @Test
    public void getDescricoesItensComApenasUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Bracelete", inventario.getDescricoesItens());
    }

    @Test
    public void getDescricoesItensSemItens() {
        Inventario inventario = new Inventario();
        assertEquals("", inventario.getDescricoesItens());
    }

    @Test
    public void aumentar1000UnidadesDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(1002, inventario.getItens().get(0).getQuantidade());
        assertEquals(1045, inventario.getItens().get(1).getQuantidade());
        assertEquals(1003, inventario.getItens().get(2).getQuantidade());
    }

    @Test
    public void aumentar1UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1);
        assertEquals(3, inventario.getItens().get(0).getQuantidade());
        assertEquals(46, inventario.getItens().get(1).getQuantidade());
        assertEquals(4, inventario.getItens().get(2).getQuantidade());
    }

    @Test
    public void aumentar0UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(0);
        assertEquals(2, inventario.getItens().get(0).getQuantidade());
        assertEquals(45, inventario.getItens().get(1).getQuantidade());
        assertEquals(3, inventario.getItens().get(2).getQuantidade());
    }

    @Test
    public void aumentarUnidadeSemItens() {
        Inventario inventario = new Inventario();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(0, inventario.getItens().size());
    }

    @Test
    public void itemComMaiorQuantidadeCom3Itens() {
        Inventario inventario = criarInventarioCom3Itens();
        Item item = inventario.getItemComMaiorQuantidade();
        assertEquals("Poção polissuco", item.getDescricao());
        assertEquals(45, item.getQuantidade());
    }

    @Test
    public void itemComMaiorQuantidadeCom3ItensDeQuantidadesIguais() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada de aço", 2));
        inventario.adicionarItem(new Item("Poção polissuco", 2));
        inventario.adicionarItem(new Item("Lucky egg", 2));
        Item item = inventario.getItemComMaiorQuantidade();
        assertEquals("Espada de aço", item.getDescricao());
        assertEquals(2, item.getQuantidade());
    }

    @Test
    public void itemComMaiorQuantidadeComInventarioVazio() {
        Inventario inventario = new Inventario();
        Item item = inventario.getItemComMaiorQuantidade();
        assertNull(item);
    }

    @Test
    public void ordenarItensBaguncados() {
        // Arrange
        Inventario mochila = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        mochila.adicionarItem(armadura);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(canivete, mochila.getItens().get(0));
        assertEquals(armadura, mochila.getItens().get(1));
        assertEquals(escudo, mochila.getItens().get(2));
    }

    @Test
    public void ordenarItensComMesmaQuantidade() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 9);
        Item escudo = new Item("Escudo", 9);
        Item canivete = new Item("Canivete suíço", 9);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }

    @Test
    public void ordenarItensVazio() {
        // Arrange
        Inventario mochila = new Inventario();
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(0, mochila.getItens().size());
    }

    @Test
    public void aumentarUnidadesProporcionalComInventarioVazio() {
        Inventario inventario = new Inventario();
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertTrue(inventario.getItens().isEmpty());
    }

    @Test
    public void aumentarUnidadesProporcionalComApenasUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada", 1));
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertEquals(1001, inventario.getItens().get(0).getQuantidade());
    }

    @Test
    public void aumentarUnidadesProporcionalComApenasDoisItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Balas .44", 2));
        inventario.adicionarItem(new Item("Balas .12", 3));
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertEquals(3002, inventario.getItens().get(0).getQuantidade());
        assertEquals(6003, inventario.getItens().get(1).getQuantidade());
    }
    
    @Test
    public void ordenarItensDescendenteComItensOrdenadosAscendente() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 1);
        Item escudo = new Item("Escudo", 2);
        Item canivete = new Item("Canivete suíço", 3);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(canivete, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(elderScroll, mochila.getItens().get(2));
    }
    
    @Test
    public void ordenarItensDescendenteComItensMesmaQuantidade() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 1);
        Item escudo = new Item("Escudo", 1);
        Item canivete = new Item("Canivete suíço", 1);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }
    
    @Test
    public void ordenarItensDescendenteJaOrdenado() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 3);
        Item escudo = new Item("Escudo", 2);
        Item canivete = new Item("Canivete suíço", 1);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }

    private Inventario criarInventarioCom3Itens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada de aço", 2));
        inventario.adicionarItem(new Item("Poção polissuco", 45));
        inventario.adicionarItem(new Item("Lucky egg", 3));
        return inventario;
    }
=======
>>>>>>> master
}