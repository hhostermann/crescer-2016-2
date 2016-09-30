

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CestoLembasTest
{
    @Test 
    public void dividirCestoDoisLemba() { 
        // Arrange 
        // Act & Assert 
        assertFalse(new CestoLembas(2).dividirPar()); 
    } 
    @Test 
    public void dividirCestoQuatroLemba() { 
        // Arrange  
        // Act & Assert 
        assertTrue(new CestoLembas(4).dividirPar()); 
    } 
    @Test
    public void dividirCestoCincoLembas(){ 
        // Act & Assert 
        assertTrue (new CestoLembas(4).dividirPar()); 
    
    }
    } 
