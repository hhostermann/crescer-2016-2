

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DwarfTest
{
    @Test
    public void criarDwarf(){
        Dwarf dwarfTeste = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        assertEquals ("Aleatorio", dwarfTeste.getNome());
    }
    @Test 
    public void dwarfPerderVidaComNumeroSorteNegativo() { 
        // Arrange 
        Dwarf dwarf = new Dwarf("Gimli", new DataTerceiraEra(1,1,2000)); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        // Assert 
        assertEquals(0, dwarf.getExperiencia()); 
        assertEquals(90, dwarf.getVida(), .0);    
    } 
 
    @Test 
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() { 
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(2, 3, 1)); 
        meireles.perdeVida(); 
        assertEquals(0, meireles.getExperiencia()); 
        assertEquals(110, meireles.getVida(), .0); 
    } 
 
    @Test 
    public void dwarfPerderVidaNormal(){ 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        dwarf.perdeVida(); 
        assertEquals(100, dwarf.getVida(), .0); 
        assertEquals(0, dwarf.getExperiencia()); 
    }     @Test 
    public void dwarfPerderVidaSobrevive(){ 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        dwarf.perdeVida(); 
        assertEquals(100, dwarf.getVida(), .0); 
        assertEquals(Status.VIVO, dwarf.getStatus()); 
    } 
    
    public void dwarfPerderVidaMorre(){ 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        
        assertEquals(0, dwarf.getVida(), .0); 
        assertEquals(Status.MORTO, dwarf.getStatus()); 
    } 
     
    @Test 
    public void adicionarItemInventario() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item sabreLuz = new Item("Sabre de Luz", 1); 
        dwarf.adicionarItem(sabreLuz); 
        assertTrue(dwarf.getInventario().getItens().contains(sabreLuz)); 
    } 
 
    @Test 
    public void inventarioSemAdicionarItem() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item pedra = new Item("Pedra", 1); 
        assertFalse(dwarf.getInventario().getItens().contains(pedra)); 
    } 
    @Test 
    public void adicionarItemNoInventario() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
    }  
    
 
    @Test 
    public void adicionarDoisItensNoInventario() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
    } 
 
    @Test 
    public void adicionarCincoItensNoInventario() { 
         Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
        assertEquals(5, dwarf.getInventario().getItens().size()); 
    } 
 
    @Test 
    public void adicionarItemNoInventarioEDepoisRemovelo() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.removerItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void adicionarDoisItensNoInventarioERemoverApenasUm() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item bastaoMagico = new Item("Bastão Mágico", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(bastaoMagico); 
        dwarf.removerItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(bastaoMagico)); 
    } 
 
    @Test 
    public void removerItemSemAdicionaloAntes() { 
        Dwarf dwarf = new Dwarf("Aleatorioo", new DataTerceiraEra(1, 1, 1)); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.removerItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
} 
 

