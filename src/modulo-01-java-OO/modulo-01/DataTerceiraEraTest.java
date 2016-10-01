

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
    public void criarAno3019QueNaoEhBissexto() { 
        // Arrange 
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019); 
        // Act 
        boolean obtido = data.ehBissexto(); 
        // Assert 
        assertFalse(obtido); 
    } 
}
