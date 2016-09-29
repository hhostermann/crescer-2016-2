import static org.junit.Assert.*; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
 
public class DwarfTest 
{ 
    @Test 
    public void dwarfNasce() { 
        Dwarf thorin = new Dwarf(); 
        assertEquals(110, thorin.getVida()); 
    } 
 
    @Test 
    public void dwarfPerdeVidaUmaVez() { 
        Dwarf thorin = new Dwarf(); 
        thorin.perderVida(); 
        assertEquals(100, thorin.getVida()); 
    } 
 
    @Test 
    public void dwarfPerdeVidaDuasVezes() { 
        Dwarf thorin = new Dwarf(); 
        thorin.perderVida(); 
        thorin.perderVida(); 
        assertEquals(90, thorin.getVida()); 
    } 

} 
 
 