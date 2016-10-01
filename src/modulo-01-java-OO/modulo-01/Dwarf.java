
public class Dwarf
{
    private int vida;
    private String nome;
    private DataTerceiraEra dataNascimento;
    private double valorInicial = 101.0;
    private int experiencia;

    public Dwarf(String n, DataTerceiraEra dataNascimento){
        this.nome = n;        
        this.dataNascimento = dataNascimento;
        this.vida=110;
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
    public void perdeVida(){
        double numero = this.getNumeroSorte();
        if (numero < 0){
            experiencia += 2;
        }
        if (numero<100){
            vida-=10;
        }
    }
    public double getNumeroSorte(){
        double valorFinal = valorInicial;
        boolean bissexto = dataNascimento.ehBissexto();
        if(bissexto && this.vida>=80 && this.vida<=90){
            valorFinal *= -33.0;
        }
        if (!bissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))){
            valorFinal = valorInicial*33 % 100;
        }
        return valorFinal;
    }

}

