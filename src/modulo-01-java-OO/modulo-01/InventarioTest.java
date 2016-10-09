

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
}