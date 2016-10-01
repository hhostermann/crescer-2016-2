

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest
{
    @Test
    public void nomeElfo(){
         //Arrange
         String nomeTeste;
         //Act
         nomeTeste = "legolas";
         Elfo elfoTest = new Elfo(nomeTeste);
         //Assert
        assertEquals(nomeTeste,  elfoTest.getNome());
        
    }
}
