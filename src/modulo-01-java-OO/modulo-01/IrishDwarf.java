
public class IrishDwarf
{ 
   private String nome;
   private DataTerceiraEra dataNascimento ;
   private int hP;
   private Status status;
   private int xP;
   private Inventario inventario;
   public IrishDwarf(String nome, DataTerceiraEra dataNascimento)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = status.VIVO;
        this.inventario = new Inventario(); 
        this.hP=110;
    }
   public Status getStatus(){
       return status;
    }
   public Inventario getInventario(){
       return inventario;
    }
   public int getXP(){
       return xP;
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
                xP = xP + 2;
            }
            if (sorte > 100){
                hP = hP - 10;
        
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
   public void adicionarItem(Item item){
       this.inventario.adicionarItem(item);
    }
   public void removerItem(Item item){
       this.inventario.removerItem(item);
    }
   public void tentarSorte(){
       boolean sorte = getNumeroSorte() == -3333;
       if (sorte){
           inventario.aumentarQuantidadePorItem();
           
        }
        
    }
}
