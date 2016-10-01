

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
    @Test
    public void criarAno3019QueNaoEhBissexto() { 
        // Arrange 
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019); 
        // Act 
        boolean obtido = data.ehBissexto(); 
        // Assert 
        assertFalse(obtido); 
    } 
    @Test
    public void criarAno3000QueEhBissexto() { 
        // Arrange 
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 2000); 
        // Act 
        boolean obtido = data.ehBissexto(); 
        // Assert 
        assertTrue(obtido); 
    } 
}
