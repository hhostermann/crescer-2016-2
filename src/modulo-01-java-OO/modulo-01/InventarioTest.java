

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void ordenaritens(){
        Inventario itens = new Inventario();
    }

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

}