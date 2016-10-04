import java.util.ArrayList;

public class Dwarf extends Personagem
{
    private int vida; 
    private DataTerceiraEra dataNascimento;
    private double resutado; 
     public Dwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome);        
        this.vida=110;
        this.dataNascimento = dataNascimento;
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
        if (this.vida >0){  
            if (resutado > 0){
                experiencia += 2; 
            }
            if (resutado<100){
                vida -= 10;
            }
        }
        else {
            this.vida = 0;
            status = status.MORTO;
        }
    }
 
    public int getVida(){
        return vida;
    } 
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        
        if(temSorte){
            inventario.aumentarUnidadesItens(1000);
        }
    }
    
    public void setPontosDeVida(int vida){ 
        this.vida = vida; 
    }
}
  