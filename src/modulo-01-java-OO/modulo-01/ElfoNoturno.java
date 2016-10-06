
public class ElfoNoturno extends Elfo {
    
    
    public ElfoNoturno(String nome, int quantidadeFlechas){ 
       super(nome);
       this.inventario.adicionarItem(new Item("Arco de Vidro", 1)); 
       this.inventario.adicionarItem(new Item("Flechas de Vidro", quantidadeFlechas >= 0 ? quantidadeFlechas : 42)); 
       this.inventario.adicionarItem(new Item("Espada de aço valiriano", 1)); 
    }
    public void atirarFlecha(Dwarf dwarf){
       int quantidadeFlechas = getFlecha().getQuantidade();
       boolean temFlecha = quantidadeFlechas > 0;
       if (this.vida > 0){
           if (temFlecha){
           getFlecha().setQuantidade(quantidadeFlechas - 1);
           experiencia = experiencia + 3;
           dwarf.perdeVida();
           vida = vida * (0.95);
           }
       }
       else{
            this.vida = 0;
            status = status.MORTO;
        }
    }
}
 