import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ExercitoDeElfoTest {
    
    @After
    //Executa antes de cada cenário de testes.
    public void tearDown(){
        System.gc();
    }
    @Test
    public void AdicionarElfoNoturnoAoBatalhao () {
        ElfoVerde elfoVerde = new ElfoVerde("aleatorio", 42);
        ExercitoDeElfo exercito = new ExercitoDeElfo();
        exercito.alistamentoMilitar(elfoVerde);
        
        assertEquals("aleatorio", exercito.getExercitoDeElfo().get(0).getNome());
        assertEquals(1, exercito.getExercitoDeElfo().size());        
    }
    
    @Test
    public void AdicionarElfoVerdeAoExercito() {
        ElfoNoturno elfoNoturno = new ElfoNoturno("Aleatorio", 42);
        ExercitoDeElfo exercito = new ExercitoDeElfo();
        
        exercito.alistamentoMilitar(elfoNoturno);
        
        assertEquals("Aleatorio", exercito.getExercitoDeElfo().get(0).getNome());
        assertEquals(1, exercito.getExercitoDeElfo().size()); 
    }
    
    @Test
    public void naoDeveAdicionarElfoAoExercito() {
        Elfo elfo = new Elfo("Aleatorio", 42);
        ExercitoDeElfo exercito = new ExercitoDeElfo();
        
        exercito.alistamentoMilitar(elfo);
        
        assertEquals(0, exercito.getExercitoDeElfo().size());    
    }
}