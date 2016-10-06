import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class BatalhaoElficoTest {
    @After
    //Executa antes de cada cenário de testes.
    public void tearDown(){
        System.gc();
    }
    @Test
    public void AdicionarElfoVerdePelotao () {
        HashMap<Integer, Elfo> batalhao = new HashMap<Integer, Elfo>();
        Elfo elfo = new ElfoVerde("aleatorio", 42);
        BatalhaoElfico batalhaoElfico = new BatalhaoElfico();
        batalhao.put(elfo.getContadorDeElfos(), elfo);
        //Act
        batalhaoElfico.alistamentoMilitar(elfo);
        HashMap<Integer, Elfo> reservado = batalhaoElfico.getBatalhao();
        //Assert
                
        assertEquals(batalhao, reservado);
        
                
    }
    @Test
    public void AdicionarElfoNoturnoPelotao () {
        HashMap<Integer, Elfo> batalhao = new HashMap<Integer, Elfo>();
        Elfo elfo = new ElfoNoturno("aleatorio", 42);
        BatalhaoElfico batalhaoElfico = new BatalhaoElfico();
        batalhao.put(elfo.getContadorDeElfos(), elfo);
        //Act
        batalhaoElfico.alistamentoMilitar(elfo);
        HashMap<Integer, Elfo> reservado = batalhaoElfico.getBatalhao();
        //Assert
                
        assertEquals(batalhao, reservado);
        
                
    }
    /*@Test
    public void buscarElfoPorIBGE(){
        Elfo elfo = new ElfoNoturno("Legolas Noturno", 31);
        BatalhaoElfico pelotao = new BatalhaoElfico();                              TO_DO
        pelotao.alistamentoMilitar(elfo);
        assertEquals(elfo, pelotao.buscar(1));
    }*/
    }