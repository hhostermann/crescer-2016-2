

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
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
        assertEquals(100, balin.getVida(),.0);
    }
    @Test
    public void ElfoVerdeAtiraDuasFlechaEmUmDwarf() {

        ElfoVerde ElfoVerde = new ElfoVerde("ElfoVerde" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoVerde.atirarFlecha(balin);
        ElfoVerde.atirarFlecha(balin);
        assertEquals(90, balin.getVida(),.0);
    }
    @Test
    public void ElfoVerdeAtiraUmaFlechaEmCadaDwarf() {
        ElfoVerde ElfoVerde = new ElfoVerde("ElfoVerde" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        Dwarf gloin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoVerde.atirarFlecha(balin);
        ElfoVerde.atirarFlecha(gloin);
        assertEquals(100, balin.getVida(),.0);
        assertEquals(100, gloin.getVida(),.0);
    }
    
    @Test 
    public void adicionarNoExercito() { 
        Elfo elfoverde = new ElfoVerde("Aleatorioo", 44); 
        elfoverde.alistamentoMilitar(elfoverde);  
        boolean elfo = elfoverde.getElfos().contains(elfoverde);
        assertTrue(elfo); 
    } 
}












