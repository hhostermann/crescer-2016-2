
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTeste{
    @Test
    public void elfoNasceComNome(){
        //Arrange
        String nomeEsperado = "Miriel";
        //Act
        Elfo elfoDoTeste = new Elfo (nomeEsperado);
        //Assert   
        assertEquals (nomeEsperado, elfoDoTeste.getNome());
    }
    @Test
    public void elfoNasceComArco(){
        //Act
        Elfo elfoDoTeste = new Elfo ("Miriel");
        //Assert   
        assertEquals (42, elfoDoTeste.getFlecha().getQuantidade());

    }
    @Test
    public void criarElfo(){
        //Act
        Elfo elfoDoTeste = new Elfo ("Finwë");
        
        //Assert   
        assertEquals ("Finwë", elfoDoTeste.getNome());
    }   
    @Test 
    public void elfoAtiraFlecha() { 
        // Act 
        Elfo elfoDoTeste = new Elfo("Elrond"); 
        // Assert 
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao()); 
        assertEquals(1, elfoDoTeste.getArco().getQuantidade()); 
    }
    
    @Test 
    public void elfoToStringInformacoesIniciais() { 
        Elfo elfoDoTeste = new Elfo("Fëanor"); 
        assertEquals("Fëanor possui 42 flechas e 0 nível de experiência.", 
            elfoDoTeste.toString()); 
 
    } 
    @Test 
    public void elfoAtiraFlechaToString() { 
        Elfo elfoDoTeste = new Elfo("Nerdanel"); 
        elfoDoTeste.atirarFlecha(new Dwarf());
        assertEquals("Nerdanel possui 41 flechas e 1 nível de experiência.", 
            elfoDoTeste.toString()); 
 
    } 
}