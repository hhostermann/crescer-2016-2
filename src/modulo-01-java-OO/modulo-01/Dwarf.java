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
}
