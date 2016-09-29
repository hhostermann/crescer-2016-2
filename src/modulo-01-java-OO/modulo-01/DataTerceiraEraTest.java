import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTerceiraEraTest{
    @Test
    
    public void dataRetorna(){
        DataTerceiraEra  inicioGuerraDoAnel = new DataTerceiraEra(1,19,3019);
        assertEquals (1, inicioGuerraDoAnel.getDia());
        assertEquals (19, inicioGuerraDoAnel.getMes());
        assertEquals (3019, inicioGuerraDoAnel.getAno());
    }
}