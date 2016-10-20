import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarfTest
{
    @Test
<<<<<<< HEAD
    public void dwarfNasceCom110Vida() {
        Dwarf gimli = new Dwarf();
        assertEquals(110, gimli.getVida(), 0.);
=======
    public void dwarfNaoPerdeVida()
    {
        Dwarf dwarfTest = new Dwarf ("Ray", new DataTerceiraEra(1,1,1));
        dwarfTest.perderVida();
        assertEquals (100, dwarfTest.getHP());
        assertEquals (Status.VIVO, dwarfTest.getStatus());
>>>>>>> master
    }

    @Test
    public void dwarfPerdiaTodaVida()
    {
        Dwarf dwarfTest = new Dwarf ("Deldeos", new DataTerceiraEra(1,1,1));
        for (int i = 0; i<=11; i++){
            dwarfTest.perderVida();
        }
        assertEquals (0, dwarfTest.getHP());
        assertEquals (Status.MORTO, dwarfTest.getStatus());
        
    }
   
    @Test
    public void dwarfTentaSorteBissextoEVidaCheia(){
        Dwarf dwarfTest = new Dwarf("Tolip", new DataTerceiraEra(1,1,2016));
        dwarfTest.perderVida();
        assertEquals (101, dwarfTest.getNumeroSorte(),0.0);
        assertEquals (Status.VIVO, dwarfTest.getStatus());       
    
    }
    @Test
    public void DwarfTentaSorteAnoBissextoEVida90eRecebeXP(){
        Dwarf dwarfTest = new Dwarf("Laro", new DataTerceiraEra(1,1,2016));
        for (int i =0; i<5;i++){
            dwarfTest.perderVida();
        }
        assertEquals (-3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (90, dwarfTest.getHP(), 0.0);
        assertEquals (Status.VIVO, dwarfTest.getStatus());
        assertEquals (6, dwarfTest.getExperiencia());
    }
    @Test
    public void dwarfTentaSorteNaoBissextoMeirelesPerdeVida(){
        Dwarf dwarfTest = new Dwarf("Meireles", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (100, dwarfTest.getHP(), 0.0);
    }
    @Test
    public void dwarfTentaSorteNaoBissextoSeixas(){
        Dwarf dwarfTest = new Dwarf ("Seixas", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (100, dwarfTest.getHP(), 0.0);
    }
    @Test
    public void dwarfTentaSorteNaoBissextoENaoSeixasOuMereles(){
        Dwarf dwarfTest = new Dwarf ("Rodolfo", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (101, dwarfTest.getNumeroSorte(), 0.0);
        
    }
    @Test
    public void dwarfAdicionaUmItem(){
        Dwarf dwarfTest = new Dwarf ("Emiliano", new DataTerceiraEra(1,1,2017));
        Item espada = new Item ("espada", 1);
        dwarfTest.adicionarItem(espada);
        assertTrue (dwarfTest.getInventario().getItem().contains(espada));

        
    }
    @Test 
    public void dwarfAdicionaDoisItens(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 1);
        Item escudo = new Item ("escudo", 1);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(escudo);
        assertTrue (dwarfTest.getInventario().getItem().contains(machado));
        assertTrue (dwarfTest.getInventario().getItem().contains(escudo));
    }
    @Test 
    public void dwarfAdicionaTresItensERemoveUm(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 1);
        Item escudo = new Item ("escudo", 1);
        Item caneca = new Item ("Caneca", 1);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(escudo);
        dwarfTest.adicionarItem(caneca);
        dwarfTest.removerItem(caneca);
        assertTrue (dwarfTest.getInventario().getItem().contains(machado));
        assertTrue (dwarfTest.getInventario().getItem().contains(escudo));
        assertFalse (dwarfTest.getInventario().getItem().contains(caneca));
    }   
    public void dwarfAdicionaTresItensERemoveUmeTentaSorte(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 4);
        Item caneca = new Item ("Caneca", 16);
        Item escudo = new Item ("escudo", 3);
        dwarfTest.adicionarItem(escudo);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(caneca);
        dwarfTest.removerItem(caneca);
        dwarfTest.tentarSorte();
        assertEquals (1003, dwarfTest.getInventario().getItem().get(1).getQuantidade());
    }
}


    @Test
    public void dwarfPerdeVidaUmaVez() {
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        assertEquals(100, gimli.getVida(), 0.);
    }

    @Test
    public void dwarfPerdeVidaDuasVezes() {
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(90, gimli.getVida(), 0.);
        assertEquals(Status.VIVO, gimli.getStatus());
    }

    @Test
    public void dwarfPerdeVidaVinteVezes() {
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(0, gimli.getVida(), 0.);
        assertEquals(Status.MORTO, gimli.getStatus());
    }

    @Test
    public void dwarfPerdeVidaOnzeVezesZeraVidaEMorre() {
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(0, gimli.getVida(), 0.);
        assertEquals(Status.MORTO, gimli.getStatus());
    }

    @Test
    public void dwarfCriadoInformandoNomeENascimento() {
        Dwarf gimli = new Dwarf("Gimli", new DataTerceiraEra(12, 11, 1900));
        assertEquals("Gimli", gimli.getNome());
        assertEquals(12, gimli.getDataNascimento().getDia());
        assertEquals(11, gimli.getDataNascimento().getMes());
        assertEquals(1900, gimli.getDataNascimento().getAno());
    }

    @Test
    public void dwarfCriadoSemInformarNomeENascimento() {
        Dwarf gimli = new Dwarf();
        assertNull(gimli.getNome());
        assertEquals(1, gimli.getDataNascimento().getDia());
        assertEquals(1, gimli.getDataNascimento().getMes());
        assertEquals(1, gimli.getDataNascimento().getAno());
    }

    @Test
    public void gerarNumeroAnoBissextoVidaEntre80e90() {
        // Arrange
        Dwarf bernardin = new Dwarf("Bernardin", new DataTerceiraEra(01, 01, 2016));
        bernardin.perderVida();
        bernardin.perderVida();
        bernardin.perderVida();
        // Act
        double resultado = bernardin.getNumeroSorte();
        // Assert
        assertEquals(-3333.0, resultado, .0);
    }

    @Test
    public void gerarNumeroAnoNaoBissextoNomeSeixas() {
        // Arrange
        Dwarf seixas = new Dwarf("Seixas", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }

    @Test
    public void gerarNumeroAnoNaoBissextoNomeMeireles() {
        // Arrange
        Dwarf seixas = new Dwarf("Meireles", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }

    @Test
    public void gerarNumeroSemEntrarNasCondicoes() {
        // Arrange
        Dwarf balin = new Dwarf("Balin", new DataTerceiraEra(1, 1, 2015));
        // Act
        double resultado = balin.getNumeroSorte();
        // Assert
        assertEquals(101.0, resultado, .0);
    }

    @Test
    public void dwarfPerderVidaComNumeroSorteNegativo() {
        // Arrange
        Dwarf dwarf = new Dwarf("Gimli", new DataTerceiraEra(1,1,2000));
        dwarf.perderVida();
        dwarf.perderVida();
        // Act
        dwarf.perderVida();
        // Assert
        assertEquals(2, dwarf.getExperiencia());
        assertEquals(90, dwarf.getVida(), .0);   
    }

    @Test
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() {
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(2, 3, 2015));
        meireles.perderVida();
        assertEquals(0, meireles.getExperiencia());
        assertEquals(110, meireles.getVida(), .0);
    }

    @Test
    public void dwarfPerderVidaNormal(){
        Dwarf dwarf = new Dwarf("André Nunin", new DataTerceiraEra(2, 3, 2015));
        dwarf.perderVida();
        assertEquals(100, dwarf.getVida(), .0);
        assertEquals(0, dwarf.getExperiencia());
    }

    @Test
    public void adicionarItemNoInventario() {
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        dwarf.adicionarItem(espadaZ);
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ));
    }

    @Test
    public void inventarioSemAdicionarItem() {
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ));
    }

    @Test
    public void adicionarDoisItensNoInventario() {
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        dwarf.adicionarItem(espadaZ);
        dwarf.adicionarItem(botasDeFerro);
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ));
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro));
    }

    @Test
    public void adicionarCincoItensNoInventario() {
        Dwarf dwarf = new Dwarf();
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
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        dwarf.adicionarItem(espadaZ);
        dwarf.perderItem(espadaZ);
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ));
    }

    @Test
    public void adicionarDoisItensNoInventarioERemoverApenasUm() {
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        Item bastaoMagico = new Item("Bastão Mágico", 1);
        dwarf.adicionarItem(espadaZ);
        dwarf.adicionarItem(bastaoMagico);
        dwarf.perderItem(espadaZ);
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ));
        assertTrue(dwarf.getInventario().getItens().contains(bastaoMagico));
    }

    @Test
    public void removerItemSemAdicionaloAntes() {
        Dwarf dwarf = new Dwarf();
        Item espadaZ = new Item("Espada Z", 1);
        dwarf.perderItem(espadaZ);
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ));
    }

    @Test
    public void aumentar1000Unidades3Itens() {
        Dwarf dwarf = new Dwarf("Sortudo", new DataTerceiraEra(1, 1, 2016));
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.adicionarItem(new Item("Espada de aço", 2));
        dwarf.adicionarItem(new Item("Poção polissuco", 45));
        dwarf.adicionarItem(new Item("Lucky egg", 3));
        dwarf.tentarSorte();
        ArrayList<Item> itens = dwarf.getInventario().getItens();
        assertEquals(1002, itens.get(0).getQuantidade());
        assertEquals(1045, itens.get(1).getQuantidade());
        assertEquals(1003, itens.get(2).getQuantidade());
    }
}


