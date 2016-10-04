
import java.util.ArrayList;

public class IrishDwarf extends Dwarf {
    private DataTerceiraEra dataNascimento;
    public IrishDwarf() {
        this(null, new DataTerceiraEra(1, 1, 1));
    }
    public IrishDwarf (String nome , DataTerceiraEra dataNascimento) {
        super(nome, dataNascimento);
        this.dataNascimento = dataNascimento;
        }
    

    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        
        if(temSorte){
            inventario.somarUnidadesItens();
        }
    }

}