<<<<<<< HEAD


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
=======
public class Dwarf {
    private int vida, experiencia;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private Status status; //= Status.VIVO;
    private Inventario inventario;

    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
        //status = Status.VIVO;
    }

    public Dwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public Dwarf(String nome, DataTerceiraEra dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
    }

    public void perderVida() {
        boolean estaMorto = status.equals(Status.MORTO);
        // sai do método
        if (estaMorto) {
            return;
        }

        double numero = this.getNumeroSorte();
        if (numero < 0) {
            this.experiencia += 2;
        }
        if (numero > 100) {
            int vidaAposFlechada = this.vida - 10;
            if (vidaAposFlechada == 0) {
                status = Status.MORTO;
            }
            if (vida > 0) {
                vida = vidaAposFlechada;
            }
        }
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNome() {
        return this.nome;
    }

    public Status getStatus() {
        return status;
    }
    
    public Inventario getInventario() {
        return inventario;
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
    
    public void adicionarItem(Item item) {
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item) {
        this.inventario.removerItem(item);
    }
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        if (temSorte) {
            // aumenta 1000 unidades para todos itens do inventario
            inventario.aumentarUnidadesDosItens(1000);
        }
    }
}
>>>>>>> master
