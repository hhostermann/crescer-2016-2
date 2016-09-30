
public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Inventario inventario;
    
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
    public Inventario getInventario(int quantidadeFlechas){
      inventario.adicionarItem(new Item("Arco", 1));
      inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
      return inventario;
    }
    public String getNome(){
        return nome;
    }
    public Item getArco (){
        return this.inventario.getItens().get(0);
    }
    public Item getFlecha(){
        return this.inventario.getItens().get(1);
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
    public void adicionarItem(Item item){
        inventario.adicionarItem(item);
    }    
    public void removerItem(Item item){
        inventario.removerItem(item);
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