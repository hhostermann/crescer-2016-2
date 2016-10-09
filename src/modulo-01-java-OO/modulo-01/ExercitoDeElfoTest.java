

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExercitoDeElfoTest
{
    @Test
    public void alistaElfoVerde(){
        ExercitoDeElfo teste = new ExercitoDeElfo();
        Elfo elfoTeste = new ElfoVerde("GreenDay", 50);
        teste.alistar(elfoTeste);
        assertEquals("GreenDay", teste.getExercitoDeElfo().get(0).getNome());
    }
     @Test
    public void alistaElfoNoturbo(){
        ExercitoDeElfo teste = new ExercitoDeElfo();
        Elfo elfoTeste = new ElfoNoturno("Mirena", 50);
        teste.alistar(elfoTeste);
        assertEquals("Mirena", teste.getExercitoDeElfo().get(0).getNome());
    }
}
