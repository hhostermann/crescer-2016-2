
import java.util.ArrayList;

public class IrishDwarf {

    private String nome;
    private int vida = 110, experiencia;
    private DataTerceiraEra dataNascimento;
    private Status status;
    private Inventario inventario;

    public IrishDwarf() {
        this(null, new DataTerceiraEra(1, 1, 1));
    }

    public IrishDwarf (String nome, DataTerceiraEra dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        status = Status.VIVO;
        inventario = new Inventario();
    }
    public Inventario getInventario(){
        return inventario;
    }
    public int getVida() {
        return vida;
    }
    public String getNome(){
        return nome;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public Status getStatus() {
        return status;
    }
    public double getNumeroSorte(){
        double resutado =101.0;
        boolean bissexto = dataNascimento.ehBissexto();
        if(bissexto && this.vida>=80 && this.vida<=90){
            resutado *= -33.0;
        }
        if (!bissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))){
            resutado = resutado*33 % 100;
        }
        return resutado;
    }
    public void perdeVida(){
        if (this.vida >=0){  
            if (getNumeroSorte() > 0){
                experiencia += 2;
            }
            if (getNumeroSorte() < 100){
                vida-=10;
            }
        }
        else {
            this.vida = 0;
            status = status.MORTO;
        }
    }
    public void adicionarItem(Item item) {
        inventario.adicionarItem(item);
    }

    public void removerItem(Item item) {
        inventario.removerItem(item);
    }

    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        
        if(temSorte){
            inventario.somarUnidadesItens();
        }
    }

}