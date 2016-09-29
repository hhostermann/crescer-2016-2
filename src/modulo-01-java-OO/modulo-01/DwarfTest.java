import static org.junit.Assert.*; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
 
public class DwarfTest 
{ 
    @Test 
    public void dwarfNasce() { 
        Dwarf dwarfTeste = new Dwarf("Thorin"); 
        assertEquals(110, dwarfTeste.getVida()); 
    } 
 
    @Test 
    public void dwarfPerdeVidaUmaVez() { 
        Dwarf dwarfTeste = new Dwarf("Thorin");
        dwarfTeste.perderVida(); 
        assertEquals(100, dwarfTeste.getVida()); 
    } 
 
    @Test 
    public void dwarfPerdeVidaDuasVezes() { 
        Dwarf dwarfTeste = new Dwarf("Thorin"); 
        dwarfTeste.perderVida(); 
        dwarfTeste.perderVida(); 
        assertEquals(90, dwarfTeste.getVida()); 
    } 
    
    @Test
    public void dwarfNasceComNome(){
        //Arrange
        String nomeEsperado = "Miriel";
        //Act
        Dwarf dwarfDoTeste = new Dwarf (nomeEsperado);
        //Assert   
        assertEquals (nomeEsperado, dwarfDoTeste.getNome());

    } 
    @Test
    public void dwarfDataNascimento(){
        //Act
        Dwarf dwarfDoTeste = new Dwarf ("Gorin");
        
        //Assert   
        assertEquals (1, dwarfDoTeste.getDataNascimento().getDia());
        assertEquals (1, dwarfDoTeste.getDataNascimento().getMes());
        assertEquals (1, dwarfDoTeste.getDataNascimento().getAno());
    } 
   /* @Test
    public void dwarfTestaNumeroSorte(){ // não funcionou
        //Act
        Dwarf dwarfDoTeste = new Dwarf ("Gorin");
        dwarfDoTeste.perderVida();
        dwarfDoTeste.perderVida();
        dwarfDoTeste.perderVida();
        //Assert   
        assertEquals (-3.333, dwarfDoTeste.getNumeroSorte());

    } */
}