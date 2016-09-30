

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


 public class InventarioTest
{
    @Test
    public void adicionaItem(){
        //Act
        Inventario inventario;
        //Item item = new Item("flecha", 30);
       inventario.adicionarItem (new Item("flecha", 30));
        //Assert  
       assertEquals(true, inventario.getItens().contains("flecha",1));


    }
}

