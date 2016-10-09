import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class elfoTest
{
    @Test
    public void elfoAtiraFlecha(){
        Elfo elfo = new Elfo("reginaldo");       
        Item flecha = new Item("flecha" , 42);
        elfo.atirarFlecha(new Dwarf("Aldalberto", new DataTerceiraEra(1,2,3333) ));
        assertEquals(41, elfo.getFlecha().getQuantidade());
    }
    @Test
    public void elfoAtira44FlechaENaoRetornaNegativo(){
        Elfo elfo = new Elfo("reginaldo");       
        Item flecha = new Item("flecha" , 42);
        for (int i=0; i < 43; i++){
           elfo.atirarFlecha(new Dwarf("Aldalberto", new DataTerceiraEra(1,2,3333) ));
        }
        assertEquals(0, elfo.getFlecha().getQuantidade());
    }
    @Test
    public void retornartoString(){
        Elfo elfo = new Elfo("Ivo");
        for (int i=0; i<10; i++){
           elfo.atirarFlecha(new Dwarf("Aldalberto", new DataTerceiraEra(1,2,3333) ));
        }
        assertEquals ("Ivo possui 32 flechas e 10 níveis de experiência." , elfo.toString());
    }
    @Test
    public void retornartoStringUmaFlecha(){
    
        Elfo elfo = new Elfo("Rodolfo");
        elfo.atirarFlecha(new Dwarf("Aldalberto", new DataTerceiraEra(1,2,3333) ));
        assertEquals ("Rodolfo possui 41 flechas e 1 níveis de experiência." , elfo.toString());
    }
    
    @Test
    public void retornartoStringZeroFlechas(){
    
        Elfo elfo = new Elfo("Rodolfo");
        assertEquals ("Rodolfo possui 42 flechas e 0 níveis de experiência." , elfo.toString());
    }
    
}
    
    
    