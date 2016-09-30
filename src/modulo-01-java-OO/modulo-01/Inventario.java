import java.util.ArrayList; 
public class Inventario
{
   private ArrayList<Item> inventario = new ArrayList<>();

   public void adicionarItem(Item item){
        inventario.add(item);
    }
   public void removerItem(Item item){
        inventario.remove(item);
    }
   public ArrayList<Item> getItens(){
       return inventario;
    }
   public String getDescricoesItens(){
       for (int i = 0; i < inventario.size(); i++) { 
            Item itemAtual = inventario.get(i); 
            
            System.out.println("%s, ", itemAtual.getDescricao()); // erro no .printl
        }   
        
   }
}
