

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
         Elfo elfoTest = new Elfo(nomeTeste, 3);
         //Assert
        assertEquals(nomeTeste,  elfoTest.getNome());
        
    }
    @Test
    public void elfoAtiraCincoFlecha(){
        Elfo elfoTeste =  new Elfo ("Galandriel", 5);
        Dwarf dwarf = new Dwarf();
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        
        assertEquals (5, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraFlecha(){
        Elfo elfoTeste =  new Elfo ("Arwen", 3);
        Dwarf dwarf = new Dwarf();
        elfoTeste.atirarFlecha(dwarf);
        assertEquals (1, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraQuarentaCincoFlecha(){
        Elfo elfoTeste =  new Elfo ("Galandriel", 42);
        Dwarf dwarf = new Dwarf();
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);      
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);       
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);       
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);        
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);        
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);        
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);        
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);       
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        
        assertEquals(0, elfoTeste.getFlecha().getQuantidade()); 
        assertEquals (42, elfoTeste.getExperiencia());
        assertEquals (-310, dwarf.getVida());
    }
    @Test 
    public void elfoAtiraDwarf(){
        //ACT
        Elfo elfoTeste = new Elfo("Dobby", 42);
        Dwarf dwarf = new Dwarf();
        elfoTeste.atirarFlecha(dwarf);
        
        assertEquals (100, dwarf.getVida());
    }
    @Test
    public void elfoToString(){
        Elfo elfoTeste = new Elfo("Legolas", 42);
        Dwarf dwarf = new Dwarf();
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.toString();
        assertEquals ("Legolas possui 38 flechas e 4 níveis de experiência.", elfoTeste.toString());
    }
}


















