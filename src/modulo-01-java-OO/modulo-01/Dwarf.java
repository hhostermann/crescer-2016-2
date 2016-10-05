import java.util.ArrayList;

public class Dwarf extends Personagem
{ 
    private DataTerceiraEra dataNascimento;
    private double resutado; 
     public Dwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome);        
        vida = 110;
        this.dataNascimento = dataNascimento;
    }  
    protected void inicializarInventario(int quantidadeFlechas) {}
    protected void alistamentoMilitar(Elfo elfo){}   
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        
        if(temSorte){
            inventario.aumentarUnidadesItens(1000);
        }
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
        boolean estaMorto = status.equals(status.MORTO);    
        if (estaMorto){
            return;
        }
        double numero = this.getNumeroSorte();
        if (numero < 0){
                this.experiencia += 2; 
            }
        if (numero > 100){
            double vidaAposFlechada = this.vida - 10;
            if (vidaAposFlechada == 0){
                status = status.MORTO;
             }
             if (vida>0) {
                 vida = vidaAposFlechada;
            }
        }
    } 
    
    public void setPontosDeVida(int vida){ 
        this.vida = vida; 
    }
} 