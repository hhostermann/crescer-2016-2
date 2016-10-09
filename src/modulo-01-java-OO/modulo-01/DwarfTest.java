import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarfTest
{
    @Test
    public void dwarfNaoPerdeVida()
    {
        Dwarf dwarfTest = new Dwarf ("Ray", new DataTerceiraEra(1,1,1));
        dwarfTest.perderVida();
        assertEquals (100, dwarfTest.getHP());
        assertEquals (Status.VIVO, dwarfTest.getStatus());
    }

    @Test
    public void dwarfPerdiaTodaVida()
    {
        Dwarf dwarfTest = new Dwarf ("Deldeos", new DataTerceiraEra(1,1,1));
        for (int i = 0; i<=11; i++){
            dwarfTest.perderVida();
        }
        assertEquals (0, dwarfTest.getHP());
        assertEquals (Status.MORTO, dwarfTest.getStatus());
        
    }
   
    @Test
    public void dwarfTentaSorteBissextoEVidaCheia(){
        Dwarf dwarfTest = new Dwarf("Tolip", new DataTerceiraEra(1,1,2016));
        dwarfTest.perderVida();
        assertEquals (101, dwarfTest.getNumeroSorte(),0.0);
        assertEquals (Status.VIVO, dwarfTest.getStatus());       
    
    }
    @Test
    public void DwarfTentaSorteAnoBissextoEVida90eRecebeXP(){
        Dwarf dwarfTest = new Dwarf("Laro", new DataTerceiraEra(1,1,2016));
        for (int i =0; i<5;i++){
            dwarfTest.perderVida();
        }
        assertEquals (-3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (90, dwarfTest.getHP(), 0.0);
        assertEquals (Status.VIVO, dwarfTest.getStatus());
        assertEquals (6, dwarfTest.getXP());
    }
    @Test
    public void dwarfTentaSorteNaoBissextoMeirelesPerdeVida(){
        Dwarf dwarfTest = new Dwarf("Meireles", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (100, dwarfTest.getHP(), 0.0);
    }
    @Test
    public void dwarfTentaSorteNaoBissextoSeixas(){
        Dwarf dwarfTest = new Dwarf ("Seixas", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (3333, dwarfTest.getNumeroSorte(), 0.0);
        assertEquals (100, dwarfTest.getHP(), 0.0);
    }
    @Test
    public void dwarfTentaSorteNaoBissextoENaoSeixasOuMereles(){
        Dwarf dwarfTest = new Dwarf ("Rodolfo", new DataTerceiraEra (1,1,2017));
        dwarfTest.perderVida();
        assertEquals (101, dwarfTest.getNumeroSorte(), 0.0);
        
    }
    @Test
    public void dwarfAdicionaUmItem(){
    
        Dwarf dwarfTest = new Dwarf ("Emiliano", new DataTerceiraEra(1,1,2017));
        Item espada = new Item ("espada", 1);
        dwarfTest.adicionarItem(espada);
        assertTrue (dwarfTest.getInventario().getItem().contains(espada));
        assertEquals (1 , dwarfTest.getInventario().getItem().size());
        
    }
    @Test 
    public void dwarfAdicionaDoisItens(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 1);
        Item escudo = new Item ("escudo", 1);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(escudo);
        assertEquals (2, dwarfTest.getInventario().getItem().size());
    }
    @Test 
    public void dwarfAdicionaTresItensERemoveUm(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 1);
        Item escudo = new Item ("escudo", 1);
        Item caneca = new Item ("Caneca", 1);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(escudo);
        dwarfTest.adicionarItem(caneca);
        dwarfTest.removerItem(caneca);
        assertEquals (2, dwarfTest.getInventario().getItem().size());
    }   
    public void dwarfAdicionaTresItensERemoveUmeTentaSorte(){
        Dwarf dwarfTest = new Dwarf ("Titu", new DataTerceiraEra (1,1,2016));
        Item machado = new Item ("machado", 4);
        Item caneca = new Item ("Caneca", 16);
        Item escudo = new Item ("escudo", 3);
        dwarfTest.adicionarItem(escudo);
        dwarfTest.adicionarItem(machado);
        dwarfTest.adicionarItem(caneca);
        dwarfTest.removerItem(caneca);
        dwarfTest.tentarSorte();
        assertEquals (1003, dwarfTest.getInventario().getItem().get(1).getQuantidade());
    }
}

