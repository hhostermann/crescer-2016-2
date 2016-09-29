import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CestoDeLembasTest
{
    @Test 
    public void dividirCestoDoisLemba() { 
        // Arrange 
        CestoDeLembas cesto = new CestoDeLembas(2); 
        // Act & Assert 
        assertFalse(cesto.dividirPar()); 
    } 
    @Test 
    public void dividirCestoQuatroLemba() { 
        // Arrange 
        CestoDeLembas cesto = new CestoDeLembas(4); 
        // Act & Assert 
        assertTrue(cesto.dividirPar()); 
    } 
    } 
