
public class Elfo extends Personagem { 
   protected double vida; 
   public Elfo(String n) {  
            this(n, 42); 
    }   
   public Elfo(String nome, int quantidadeFlechas) { 
       super(nome);
       this.inventario.adicionarItem(new Item("Arco", 1)); 
       this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42)); 
       this.vida = 100;
    } 
   public String getNome(){
        return nome;
    }
   public int getExperiencia(){
        return experiencia;
    }
   public Item getArco(){
      return inventario.getItens().get(0);
    }
   public Item getFlecha(){
      return inventario.getItens().get(1);
    }
   public void atirarFlecha(Dwarf dwarf){
       int quantidadeFlechas = getFlecha().getQuantidade();
       boolean temFlecha = quantidadeFlechas > 0;
       if (temFlecha){
           getFlecha().setQuantidade(quantidadeFlechas - 1);
           experiencia++;
           dwarf.perdeVida();
       }
   }
   public String toString(){
       boolean flechaSingular = inventario.getItens().get(1).getQuantidade() == 1;
       boolean experienciaSingular = this.experiencia == 0 || this.experiencia == 1;
       
       return String.format("%s possui %d %s e %d %s de experiência.", this.nome, 
                                                                       inventario.getItens().get(1).getQuantidade(),
                                                                       flechaSingular ? "flecha" : "flechas", 
                                                                       this.experiencia,
                                                                       experienciaSingular ? "nível" : "níveis");
    }
}
