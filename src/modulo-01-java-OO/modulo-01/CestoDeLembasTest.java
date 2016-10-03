import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CestoDeLembasTest
{   
    @Test
    public void CestoDeLembasTestFalse(){
        CestoDeLembas cestoTest = new CestoDeLembas(3);

        assertFalse (cestoTest.dividirLembas());
    }
    
    @Test
    public void CestoDeLembasTestTrue(){
        CestoDeLembas cestoTest = new CestoDeLembas(8);

        assertTrue (cestoTest.dividirLembas());
    }
}
