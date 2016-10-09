
public class Dwarf extends Personagem{ 

   protected DataTerceiraEra dataNascimento ;
   protected int hP; 
   protected Status status;

   protected Inventario inventario;
   public Dwarf(String nome, DataTerceiraEra dataNascimento)
    {
       super(nome);
        this.dataNascimento = dataNascimento;
        this.hP=110;
        status = status.VIVO;
    }
   public Status getStatus(){
       return status;
    }
   public Inventario getInventario(){
       return inventario;
    }
   public int getHP(){
       return hP;
    }
   public void perderVida(){
       if (hP <=0){
           hP = 0;
           status = status.MORTO;
        }
       if (hP >0){
            double sorte = getNumeroSorte();
            if (sorte < 0){
                experiencia += 2;
            }
            if (sorte > 100){
                hP -= 10;
        
            }      
        }
    }
   public double getNumeroSorte(){
       boolean bissexto = dataNascimento.ehBissexto();
       double valorInicial = 101.0;
       if (bissexto && (hP >= 80 && hP <= 90)){
           valorInicial *= -33;
           
        }
       if (!bissexto && (nome == "Seixas" || nome == "Meireles")){
           valorInicial *= 33 % 100;
           
        }
       return valorInicial;
    }
   public void tentarSorte(){
       boolean sorte = getNumeroSorte() == -3333;
       if (sorte){
           inventario.AumentarQuantidadeItens(1000);
           
        }
        
    }
   public void inicializarInventario(int quantidadeFlechas){};
}
