<<<<<<< HEAD
=======

>>>>>>> master
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD

public class ElfoVerdeTest {

    @After
    // executa após cada cenário de testes.
    public void tearDown() {
        System.gc();
    }

    @Test
    public void elfoVerdeAdicionaEspadaValiriana() {
        ElfoVerde sortudo = new ElfoVerde("Sortudo");
        Item espada = new Item("Espada de aço valiriano", 1);
        sortudo.adicionarItem(espada);
        assertEquals(3, sortudo.getInventario().getItens().size());
        assertEquals(espada, sortudo.getInventario().getItens().get(2));
=======
 
public class ElfoVerdeTest
{
     @Test
    public void ElfoVerdeAtiraDuasFlecha() {
        // Arrange
        ElfoVerde legolas = new ElfoVerde("ElfoVerde" , 42);
        // Act
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
    }
    @Test
    public void ElfoVerdeAtiraFlechaEmUmDwarf() {
        ElfoVerde ElfoVerde = new ElfoVerde("ElfoVerde" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoVerde.atirarFlecha(balin);
        assertEquals(100, balin.getHP(),.0);
>>>>>>> master
    }

<<<<<<< HEAD
    @Test
    public void elfoVerdeAdicionaItemComDescricaoInvalida() {
        ElfoVerde sortudo = new ElfoVerde("Mugless");
        Item caneca = new Item("Caneca", 1);
        sortudo.adicionarItem(caneca);
        boolean adicionou = sortudo.getInventario().getItens().contains(caneca);
        assertEquals(2, sortudo.getInventario().getItens().size());
        assertFalse(adicionou);
=======
        ElfoVerde ElfoVerde = new ElfoVerde("ElfoVerde" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoVerde.atirarFlecha(balin);
        ElfoVerde.atirarFlecha(balin);
        assertEquals(90, balin.getHP());
    }
    @Test
    public void ElfoVerdeAtiraUmaFlechaEmCadaDwarf() {
        ElfoVerde ElfoVerde = new ElfoVerde("ElfoVerde" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        Dwarf gloin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoVerde.atirarFlecha(balin);
        ElfoVerde.atirarFlecha(gloin);
        assertEquals (4, ElfoVerde.getExperiencia());
        assertEquals(100, balin.getHP(),.0);
        assertEquals(100, gloin.getHP(),.0);
    }
>>>>>>> master
    }

    @Test
    public void elfoVerdeAdicionaFlechaVidroENulo() {
        ElfoVerde sortudo = new ElfoVerde("Celeborn");
        Item flechaDeVidro = new Item("Flecha de Vidro", 1);
        sortudo.adicionarItem(flechaDeVidro);
        sortudo.adicionarItem(null);
        assertEquals(3, sortudo.getInventario().getItens().size());
        assertEquals(flechaDeVidro, sortudo.getInventario().getItens().get(2));
    }

    @Test
    public void elfoVerdeAdicionaArcoEFlechaVidroEDescricaoNula() {
        ElfoVerde sortudo = new ElfoVerde("Celeborn");
        Item arcoEFlecha = new Item("Arco de Vidro", 1);
        Item descricaoNula = new Item(null, 1);
        sortudo.adicionarItem(arcoEFlecha);
        sortudo.adicionarItem(descricaoNula);
        assertEquals(3, sortudo.getInventario().getItens().size());
        assertEquals(arcoEFlecha, sortudo.getInventario().getItens().get(2));
    }

    @Test
    public void elfoVerdeGanhaExperienciaMesmoNaoTendoFlechas() {
        ElfoVerde greenLegolas = new ElfoVerde("Green Legolas", 1);
        greenLegolas.atirarFlecha(new Dwarf());
        greenLegolas.atirarFlecha(new Dwarf());
        assertEquals(2, greenLegolas.getExperiencia());
    }

}
