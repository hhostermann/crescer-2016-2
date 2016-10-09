import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class HobbitContadorTest {
    @Test
    public void calcularDiferencaTresParesNormais() {
        HobbitContador contador = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(15, 18)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(4, 5)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(12, 60)));
        contador.calcularDiferenca(arrayDePares);    
        assertEquals(840, contador.calcularDiferenca(arrayDePares));
    }
    /*@Test
    public void calcularDiferencaComZeroEUm() {
        HobbitContador contador = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();                 não pode dividir 0
        arrayDePares.add(new ArrayList<>(Arrays.asList(13, 91)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(0, 0)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(1, 1)));
        contador.calcularDiferenca(arrayDePares);
        assertEquals(1092, contador.calcularDiferenca(arrayDePares));
    }*/
    @Test
    public void calcularDiferencaSemDiferenca() {
        HobbitContador contador = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(19, 60)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(15, 7)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(4, 5)));
        contador.calcularDiferenca(arrayDePares);
        assertEquals(0, contador.calcularDiferenca(arrayDePares));
    }
    @Test
    public void calcularDiferencaComParesVazio() {
        HobbitContador contador = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        contador.calcularDiferenca(arrayDePares);
        assertEquals(0, contador.calcularDiferenca(arrayDePares));
    }

}
