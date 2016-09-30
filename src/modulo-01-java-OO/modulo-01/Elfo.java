
public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Inventario inventario;
    
    public Elfo (String n){    // Chamando construtor debaixo  
        this.nome = n;  }

     public Inventario getInventario(int quantidadeFlechas){ 
      inventario.adicionarItem(new Item("Arco", 1)); 
      inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42)); 
      return inventario; 
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