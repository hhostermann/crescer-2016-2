
public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    
    public Elfo (String n){    // Chamando construtor debaixo 
        this(n, 42); 
    }
     
    public Elfo(String nome, int quantidadeFlechas) { 
        this.nome = nome; 
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42); 

    }
    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public Item getArco (){
        return arco;
    }
    public Item getFlecha(){
        return flecha;
    }   
    public int getExperiencia(){
        return experiencia;
    }
    public void atirarFlecha(Dwarf dwarf){
      boolean temFlecha = flecha.getQuantidade() > 0;
      if (temFlecha){
          flecha.setQuantidade(flecha.getQuantidade()-1);
          experiencia++;
          dwarf.perderVida();
        }
    }  
    public String toString() {
        boolean flechaSingular = this.flecha.getQuantidade() == 1;
        boolean experienciaSingular = this.experiencia == 0 || this.experiencia ==1;
        return String.format("%s possui %d %s e %d %s de experiência." ,
            this.nome,
            this.flecha.getQuantidade(),
            flechaSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaSingular ? "nível" : "níveis"); 
        }
}