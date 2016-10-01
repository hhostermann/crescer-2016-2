

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
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        
        assertEquals (5, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraFlecha(){
        Elfo elfoTeste =  new Elfo ("Arwen");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        elfoTeste.atirarFlecha(dwarf);
        assertEquals (1, elfoTeste.getExperiencia());
    }
    @Test
    public void elfoAtiraQuarentaCincoFlecha(){
        Elfo elfoTeste =  new Elfo ("Galandriel");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
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
        assertEquals (-10, dwarf.getVida());
    }
    @Test 
    public void elfoAtiraDwarf(){
        //ACT
        Elfo elfoTeste = new Elfo("Dobby");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        elfoTeste.atirarFlecha(dwarf);
        
        assertEquals (100, dwarf.getVida());
    }
    @Test
    public void elfoToString(){
        Elfo elfoTeste = new Elfo("Legolas");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.atirarFlecha(dwarf);
        elfoTeste.toString();
        assertEquals ("Legolas possui 38 flechas e 4 níveis de experiência.", elfoTeste.toString());
    }
        @Test
    public void elfoTo12String(){
        Elfo elfoTeste = new Elfo("Legolas");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,1457));
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
        elfoTeste.toString();
        assertEquals ("Legolas possui 30 flechas e 12 níveis de experiência.", elfoTeste.toString());
    }
        @Test
    public void elfo0ToString(){
        Elfo elfoTeste = new Elfo("Legolas");
        Dwarf dwarf = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        elfoTeste.toString();
        assertEquals ("Legolas possui 42 flechas e 0 nível de experiência.", elfoTeste.toString());
    }
}


















