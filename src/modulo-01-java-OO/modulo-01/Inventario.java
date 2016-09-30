import java.util.ArrayList; 
public class Inventario
{
   private ArrayList<Item> inventario = new ArrayList<Item>();
 
   //public Inventario (){
        //this.item = new Item (item);
        //ArrayList <Item> item = new ArrayList<Item> ();
    //}
   public void adicionarItem(Item item){
            inventario.add(item);
    }
   public void removerItem(Item item){
        inventario.remove(item);
    }
}
