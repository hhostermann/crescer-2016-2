

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest
{
     @Test
    public void ElfoNoturnoAtiraDuasFlecha() {
        // Arrange
        ElfoNoturno legolas = new ElfoNoturno("Batman" , 42);
        // Act
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
       legolas.atirarFlecha(new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1)));
    }
    @Test
    public void ElfoNoturnoAtiraFlechaEmUmDwarf() {
        ElfoNoturno ElfoNoturno = new ElfoNoturno("Batman" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoNoturno.atirarFlecha(balin);
        assertEquals(100, balin.getVida(),.0);
    }
    @Test
    public void ElfoNoturnoAtiraDuasFlechaEmUmDwarf() {

        ElfoNoturno ElfoNoturno = new ElfoNoturno("Batman" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoNoturno.atirarFlecha(balin);
        ElfoNoturno.atirarFlecha(balin);
        assertEquals(90, balin.getVida(),.0);
    }
    @Test
    public void ElfoNoturnoAtiraUmaFlechaEmCadaDwarf() {
        ElfoNoturno ElfoNoturno = new ElfoNoturno("Batman" , 42);
        Dwarf balin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        Dwarf gloin = new Dwarf("Gimili", new DataTerceiraEra(1, 1, 1));
        ElfoNoturno.atirarFlecha(balin);
        ElfoNoturno.atirarFlecha(gloin);
        assertEquals(100, balin.getVida(),.0);
        assertEquals(100, gloin.getVida(),.0);
    }
}
