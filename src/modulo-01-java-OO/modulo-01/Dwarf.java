import java.util.ArrayList;

public class Dwarf
{
    private int vida;
    private String nome;
    private DataTerceiraEra dataNascimento;
    private int experiencia;
    private Status status;
    private double resutado; 
    private Inventario inventario;
    public Dwarf(String n, DataTerceiraEra dataNascimento){
        this.nome = n;        
        this.dataNascimento = dataNascimento;
        this.vida=110;
        this.status = status.VIVO;
        this.inventario = new Inventario(); 
    }
 
    public Inventario getInventario(){
        return inventario;
    }
        public int getVida(){
        return vida;
    }
    public String getNome(){
        return nome;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public Status getStatus(){
        return status;
    }
    public void setPontosDeVida(int vida){ 
        this.vida = vida; 
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
            if (resutado > 0){
                experiencia += 2;
            }
            if (resutado<100){
                vida-=10;
            }
        }
        else {
            this.vida = 0;
            status = status.MORTO;
        }
    }
    public void adicionarItem(Item item){
        this.inventario.adicionarItem (item);
    }
    public void perderItem(Item item){
        this.inventario.adicionarItem (item);
    }
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        
        if(temSorte){
            inventario.somarUnidadeItens();
        }
    }
}
  