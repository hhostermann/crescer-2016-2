import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest {
    @After
    // executa após cada cenário de testes.
    public void tearDown() {
        System.gc();
    }
    
    @Test

    public void elfoNasceComNome() {
        // Arrange
        String nomeEsperado = "Bruce Wayne";
        // Act
        Elfo elfoDoTeste = new Elfo(nomeEsperado);
        // Assert
        assertEquals(nomeEsperado, elfoDoTeste.getNome());
    }
    @Test
    public void elfoNasceCom100DeVida() {
        assertEquals(100, new Elfo("Legolas").getVida(), 0.);
    }

    @Test
    public void elfoNasceComArco() {
       // Act
        Elfo elfoDoTeste = new Elfo("Elrond");

        // Assert

        assertEquals("Arco", elfoDoTeste.getArco().getDescricao());
        assertEquals(1, elfoDoTeste.getArco().getQuantidade());
    } 
    @Test
     public void elfoNasceCom42Flechas() {
        // Act
        Elfo elfoDoTeste = new Elfo("Elrond");
        // Assert
        assertEquals("Flechas", elfoDoTeste.getFlecha().getDescricao());
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
    }
    @Test
    public void elfoAtiraUmaFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
        // Assert
        assertEquals(41, legolas.getFlecha().getQuantidade());
        assertEquals(1, legolas.getExperiencia());
    }
    @Test
    public void elfoAtiraDuasFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
    }
    @Test
    public void elfoAtiraFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        elfo.atirarFlecha(balin);
        assertEquals(100, balin.getVida(), 0.);
    }
    @Test
    public void elfoAtiraDuasFlechaEmUmDwarf() {

        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(balin);
        assertEquals(90, balin.getVida(), 0.);
    }
    @Test
    public void elfoAtiraUmaFlechaEmCadaDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        Dwarf gloin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(gloin);
        assertEquals(100, balin.getVida(), 0.);
        assertEquals(100, gloin.getVida(), 0.);
    }
    @Test
    public void elfoToStringComInformacoesIniciais() {
        Elfo legolas = new Elfo("Legolas");
        assertEquals("Legolas possui 42 flechas e 0 nível de experiência.", legolas.toString());
    }
    @Test
    public void elfoAtiraFlechaEToString() {

        Elfo legolas = new Elfo("Legolas");

        legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1))); 
        assertEquals("Legolas possui 41 flechas e 1 nível de experiência.", legolas.toString());

    }

    @Test

    public void elfoAtiraDuasFlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
        legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
        assertEquals("Legolas possui 40 flechas e 2 níveis de experiência.",
            legolas.toString());


    }

    @Test
    public void elfoAtira41FlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
        for(int i=0; i<41; i++){
        legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
         
    }
        assertEquals("Legolas possui 1 flecha e 41 níveis de experiência.",
        legolas.toString());
    }

    @Test
    public void criarElfoInformandoFlechas() {
        Elfo elrond = new Elfo("Elrond", 56);
        assertEquals(56, elrond.getFlecha().getQuantidade());
    }

    @Test
    public void criarElfoInformandoZeroFlechas() {
        Elfo elrond = new Elfo("Elrond", 0);
        assertEquals(0, elrond.getFlecha().getQuantidade());

    }

    @Test

    public void criarElfoInformandoFlechasNegativas() {
        Elfo elrond = new Elfo("Elrond", -56);
        assertEquals(42, elrond.getFlecha().getQuantidade());
    }

    @Test public void elfoNasceVivo() {
        Elfo elfo = new Elfo("Cobaia");
        assertEquals(Status.VIVO, elfo.getStatus());

    }

    @Test
    public void aoCriarElfoIncrementaContador() {
        new Elfo("Nyna Magsandoral");
        assertEquals(1, Elfo.getContadorDeElfos());
    }

    @Test
    public void aoCriarVariosElfosIncrementaContador() {
        new Elfo("Nyna Magsandoral");
        new ElfoVerde("Flardryn Brynan");
        new Elfo("Isilfarrel Xilrieth");
        assertEquals(3, Elfo.getContadorDeElfos());
    }

}


