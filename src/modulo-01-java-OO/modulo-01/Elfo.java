
public class Elfo
{
    /*

     * Os Elfos querem um superávit de flechas, 
       * para isso não podem ter flechas negativas.
         * Altere o código para garantir que um elfo não tenha flechas negativas.*/

   private String nome;
   private Item arco;
   private Item flecha;
   private int experiencia;
   private Inventario inventario;
   public Elfo(String n){  
        this(n, 42); 
       }   
   public Elfo(String nome, int quantidadeFlechas) { 
       this.nome = nome;
       this.inventario = new Inventario();
       this.inventario.adicionarItem(new Item("Arco", 1)); 
       this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42)); 
    } 
   public String getNome(){
        return nome;
    }
   public int getExperiencia(){
        return experiencia;
    }
   public Item getFlecha(){
       return flecha;
    }
   public void atirarFlecha(Dwarf dwarf){
       if (flecha.getQuantidade() > 0){
           flecha.setQuantidade(flecha.getQuantidade() - 1);
           experiencia++;
           dwarf.perdeVida();
       }
   }
   public String toString(){
       boolean flechaSingular = this.flecha.getQuantidade() == 1;
       boolean experienciaSingular = this.experiencia == 0 || this.experiencia == 1;
       
       return String.format("%s possui %d %s e %d %s de experiência.", this.nome, 
                                                                       this.flecha.getQuantidade(),
                                                                       flechaSingular ? "flecha" : "flechas", 
                                                                       this.experiencia,
                                                                       experienciaSingular ? "nível" : "níveis");
    }
}
