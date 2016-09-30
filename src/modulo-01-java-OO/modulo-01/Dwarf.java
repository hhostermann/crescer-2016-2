

public class Dwarf{
    private int vida;
    private int experiencia;
    private String nome;
    private DataTerceiraEra dataNascimento;
    private Status status;
    private double numeroSorte;
    private double resutado;
    {
        vida=110;
    }
    public Dwarf (String n){    // Chamando construtor debaixo 
        nome = n;
        dataNascimento = new DataTerceiraEra (1, 1, 1);
        status = Status.VIVO;
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
    public void setPontosDeVida(int vida){
        this.vida = vida;
    }
    public int getPontosDeVida(){
        return vida;
    }
    public Status getStatus(){
        return status;
    }
    /* public void setNumeroSorte (double numeroSorte){
        numeroSorte = 101.0;
        if ((dataNascimento.ehBissexto() == true)&& (vida>=80)&&(vida<=90)){
            this.numeroSorte *= (-33);
            }
        if ((dataNascimento.ehBissexto() == false)&& (nome == "Seixas") && (nome == "Meireles")){
            this.numeroSorte = numeroSorte * 33;
            this.numeroSorte = numeroSorte % 100;
        }
    }*/
    public double getNumeroSorte(){
        double resutado =101.0;
        if ((dataNascimento.ehBissexto() && vida>=80 && vida<=90)){
            resutado *= (-33);
            }
        if (!dataNascimento.ehBissexto()&& ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))){
            resutado = resutado*33 % 100;
        }
        return resutado;
    }
    public void perderVida(){
        if (vida > 0){
            if (resutado<0){
                this.experiencia += 2;
            }
            if ( resutado<=10){
                vida -= 10;
            }
        }
        else{
            vida = 0;
            status = Status.MORTO;
        }
    }
    public int getVida(){
        return vida;
    }
    public int getExperiencia(){
        return experiencia;
    }
}