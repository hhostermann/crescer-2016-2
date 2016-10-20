<<<<<<< HEAD
// Java: public final class
// C#: public sealed class
public class Dwarf extends Personagem {
    private final DataTerceiraEra dataNascimento;
    public final static double ALTURA_MAXIMA = 1.32;

public class Dwarf extends Personagem
{ 
    private DataTerceiraEra dataNascimento;
    private double resutado; 
     public Dwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome);        
        vida = 110;
        //status = Status.VIVO;
    }

    public Dwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public Dwarf(String nome, DataTerceiraEra dataNascimento) {
        super(nome);
        this.dataNascimento = dataNascimento;
=======

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
>>>>>>> master
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
<<<<<<< HEAD
    public void perdeVida(){
        boolean estaMorto = status.equals(status.MORTO);    
        if (estaMorto){
            return;
        }
        double numero = this.getNumeroSorte();
        if (numero < 0) {
            this.experiencia += 2;
        }
        if (numero > 100) {
            double vidaAposFlechada = this.vida - 10;
            if (vidaAposFlechada == 0) {
                status = Status.MORTO;
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

    public DataTerceiraEra getDataNascimento() {
        return this.dataNascimento;
    }

    public double getNumeroSorte() {
        double resultado = 101.;
        boolean ehBissexto = dataNascimento.ehBissexto();

        if (ehBissexto && this.vida >= 80 && this.vida <= 90) {
            resultado *= -33.0;
        }
        //if (!dataNascimento.ehBissexto() && this.nome != null && (this.nome.equals("Seixas") || this.nome.equals("Meireles"))) {
        if (!ehBissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))) {
            resultado = resultado * 33 % 100;
        }

        return resultado;
    }
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        if (temSorte) {
            // aumenta 1000 unidades para todos itens do inventario
            inventario.aumentarUnidadesDosItens(1000);
        }
    }
    
    public void inicializarInventario(int quantidadeFlechas) { }
=======
   public void tentarSorte(){
       boolean sorte = getNumeroSorte() == -3333;
       if (sorte){
           inventario.AumentarQuantidadeItens(1000);
           
        }
        
    }
   public void inicializarInventario(int quantidadeFlechas){};
>>>>>>> master
}
