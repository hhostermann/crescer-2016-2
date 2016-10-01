
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
  
    
   public Elfo (String n) { 
        nome = n; 
        arco = new Item("Arco", 1); 
        flecha = new Item("Flecha", 42);
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
       return nome+ " possui "+flecha.getQuantidade()+" flechas e "+experiencia+" níveis de experiência.";
    }
}
