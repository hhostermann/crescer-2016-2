
public class Dwarf{
    private int vida;
    private String nome;
    private DataTerceiraEra dataNascimento;
    {
        vida=110;
    }
    public Dwarf (String n){    // Chamando construtor debaixo 
        nome = n;
        dataNascimento = new DataTerceiraEra (1, 1, 1);
    }
    public void setNome(String n){ 
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
    }
    public void perderVida(){
        vida -= 10;
    }
    public int getVida(){
        return vida;
    }
}