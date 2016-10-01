

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
    @Test
    public void elfoAtiraCincoFlecha(){
        Elfo elfoTeste =  new Elfo ("Galandriel");
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        
        assertEquals (5, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraFlecha(){
        Elfo elfoTeste =  new Elfo ("Arwen");
        elfoTeste.atirarFlecha();
        assertEquals (1, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraQuarentaCincoFlecha(){
        Elfo elfoTeste =  new Elfo ("Galandriel");
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();      
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();       
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();       
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();        
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();        
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();        
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();        
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();       
		elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        elfoTeste.atirarFlecha();
        
        assertEquals(0, elfoTeste.getFlecha().getQuantidade()); 
        assertEquals (42, elfoTeste.getExperiencia());
    }
}
