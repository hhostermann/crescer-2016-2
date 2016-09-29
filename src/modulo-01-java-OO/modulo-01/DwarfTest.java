import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarfTest 
{ 
    @Test 
    public void dwarfNasceComNome() { 
        // Arrange 
        String nomeEsperado = "Barry Allen"; 
        // Act 
        Dwarf dwarfDoTeste = new Dwarf(nomeEsperado); 
        // Assert 
        assertEquals(nomeEsperado, dwarfDoTeste.getNome()); 
    } 
    @Test
    public void dwarfMorre(){
        Dwarf dwarfTeste = new Dwarf ("pocaSombra");
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        dwarfTeste.perderVida();
        
        assertEquals(Status.MORTO, dwarfTeste.getStatus());
    }
}