<<<<<<< HEAD
public class Elfo extends Personagem {

    private static int contadorDeElfos;
    
    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }

    public Elfo(String nome, int quantidadeFlechas) {
        super(nome);
        this.vida = 100;
        this.inicializarInventario(quantidadeFlechas);
        Elfo.contadorDeElfos++;
    }
    
    // ~Elfo() { }
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#finalize()
    protected void finalize() throws Throwable {
        super.finalize();
        Elfo.contadorDeElfos--;
    }
    
    public static int getContadorDeElfos() {
        return Elfo.contadorDeElfos;
    }

    public Item getArco() {
        return this.inventario.getItens().get(0);
    }

    public Item getFlecha() {
        return this.inventario.getItens().get(1);
    }

    public void atirarFlecha(Dwarf dwarf) {
        atirarFlechas(dwarf, 1);
    }

    protected void atirarFlechas(Dwarf dwarf, int fatorExperiencia) {
        int quantidadeFlechas = getFlecha().getQuantidade();
        boolean temFlecha = quantidadeFlechas > 0;
        if (temFlecha) {
            getFlecha().setQuantidade(quantidadeFlechas - 1);
            experiencia += 1 * fatorExperiencia;
            dwarf.perderVida();
        }
    }

    protected void inicializarInventario(int quantidadeFlechas) {
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }

    public String toString() {
        //return "<nome> possui <flechas> flechas e <exp> níveis de experiência.";

        int quantidadeFlechas = this.getFlecha().getQuantidade();
        boolean flechaNoSingular = quantidadeFlechas == 1;
        boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia == 1;

        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            quantidadeFlechas,
            // ?:
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaNoSingular ? "nível" : "níveis"
        );
    }

=======
public class Elfo extends Personagem{
    private String nome;
    private Item arco;
    private Item flecha;
    private int xP;
    private int hP;
    protected static int ibgElfico = 0;
    public Elfo(String nome){
        super(nome);
        arco = new Item("arco", 1);
        flecha = new Item ("flecha", 42);
        hP = 100;
        ibgElfico ++;
    }
    public void atirarFlecha(Dwarf dwarf){
        int flechaNum = flecha.getQuantidade();
        if (flechaNum > 0 ){
            dwarf.perderVida();
            xP++;
           flechaNum--;
        }   
        flecha.setQuantidade(flechaNum);
    }
    public Item getFlecha(){
        return flecha;
        }
    public String toString(){
        int xpAtual;
        int flechaAtual;
        flechaAtual = flecha.getQuantidade();
        xpAtual = xP;
        boolean xpSing = xpAtual == 0 && xpAtual == 1;
        boolean flechaSing = flechaAtual == 1;
        return String.format ("%s possui %d %s e %d %s de experiência.", this.nome, flechaAtual, flechaSing ? "flecha" : "flechas",
                                                                     xpAtual, xpSing ? "nível" : "níveis");
    }
    public void inicializarInventario (int quantidadeFlechas){}
    } 
>>>>>>> master
