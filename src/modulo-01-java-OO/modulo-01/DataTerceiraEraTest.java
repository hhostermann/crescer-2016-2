import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTerceiraEraTest{
    public void dataFimDaGuerra(){
        DataTerceiraEra  FimGuerraDoAnel = new DataTerceiraEra(1,10,3019);
        assertFalse (new DataTerceiraEra(1,10,3019).ehBissexto());
    }
     
    public void dataBissexto(){
        assertTrue (new DataTerceiraEra(1,10,2000).ehBissexto());
    }             
    @Test 
    public void criarAno1100QueNaoEhBissexto() { 
        assertFalse(new DataTerceiraEra(1, 1, 1100).ehBissexto()); 
    } 
}