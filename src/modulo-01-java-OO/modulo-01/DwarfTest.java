

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DwarfTest
{
    @Test
    public void criarDwarf(){
        Dwarf dwarfTeste = new Dwarf("Aleatorio", new DataTerceiraEra(1,1,2000));
        assertEquals ("Aleatorio", dwarfTeste.getNome());
    }
    @Test 
    public void dwarfPerderVidaComNumeroSorteNegativo() { 
        // Arrange 
        Dwarf dwarf = new Dwarf("Gimli", new DataTerceiraEra(1,1,2000)); 
        dwarf.perdeVida(); 
        dwarf.perdeVida(); 
        // Act 
        dwarf.perdeVida(); 
        // Assert 
        assertEquals(0, dwarf.getExperiencia()); 
        assertEquals(110, dwarf.getVida(), .0);    
    } 
 
    @Test 
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() { 
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(2, 3, 2015)); 
        meireles.perdeVida(); 
        assertEquals(0, meireles.getExperiencia()); 
        assertEquals(100, meireles.getVida(), .0); 
    } 
 
    @Test 
    public void dwarfPerderVidaNormal(){ 
        Dwarf dwarf = new Dwarf("André Nunin", new DataTerceiraEra(2, 3, 2015)); 
        dwarf.perdeVida(); 
        assertEquals(110, dwarf.getVida(), .0); 
        assertEquals(0, dwarf.getExperiencia()); 
    } 
} 

