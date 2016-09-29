
public class Dwarf{
    private int vida;
    private int experiencia;
    private String nome;
    private DataTerceiraEra dataNascimento;
    private double numeroSorte;
    {
        vida=110;
    }
    public Dwarf (String n){    // Chamando construtor debaixo 
        nome = n;
        dataNascimento = new DataTerceiraEra (1, 1, 1);
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
    public void setNumeroSorte (double numeroSorte){
        numeroSorte = 101.0;
        if ((dataNascimento.ehBissexto() == true)&& (vida>=80)&&(vida<=90)){
            this.numeroSorte = numeroSorte *(-33);
            }
        if ((dataNascimento.ehBissexto() == false)&& (nome == "Seixas") && (nome == "Meireles")){
            this.numeroSorte = numeroSorte * 33;
            this.numeroSorte = numeroSorte % 100;
        }
    }
    public double getNumeroSorte(){
        return numeroSorte;
    }
        public void perderVida(){
        if (numeroSorte.getNumeroSorte()<0){
            experiencia++;
        }
        if ((numeroSorte.getNumeroSorte()>=0) &&(numeroSorte.getNumeroSorte()<=10)){
            experiencia = experiencia;
        }
        else{
            vida -= 10;
        }
    }
    public int getVida(){
        return vida;
    }