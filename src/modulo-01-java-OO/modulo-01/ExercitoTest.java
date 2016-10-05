import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ExercitoTest {
    @Test
    public void AdicionarElfoNoturnoAoExercito () {
        ElfoVerde elfoVerde = new ElfoVerde("aleatorio", 42);
        Exercito exercito = new Exercito();
        exercito.alistamentoMilitar(elfoVerde);
        
        assertEquals("aleatorio", exercito.getExercito().get(0).getNome());
        assertEquals(1, exercito.getExercito().size());        
    }
    
    @Test
    public void AdicionarElfoVerdeAoExercito() {
        ElfoNoturno elfoNoturno = new ElfoNoturno("Aleatorio", 42);
        Exercito exercito = new Exercito();
        
        exercito.alistamentoMilitar(elfoNoturno);
        
        assertEquals("Aleatorio", exercito.getExercito().get(0).getNome());
        assertEquals(1, exercito.getExercito().size()); 
    }
    
    @Test
    public void naoDeveAdicionarElfoAoExercito() {
        Elfo elfo = new Elfo("Aleatorio", 42);
        Exercito exercito = new Exercito();
        
        exercito.alistamentoMilitar(elfo);
        
        assertEquals(0, exercito.getExercito().size());    
    }
}