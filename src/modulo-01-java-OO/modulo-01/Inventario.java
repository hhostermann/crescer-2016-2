import java.util.ArrayList; 

 
public class Inventario { 
    private ArrayList<Item> itens; 
 
    public Inventario() { 
        itens = new ArrayList<>(); 
     } 
    public ArrayList<Item> getItens() { 
        return itens; 
    } 
     
    public void adicionarItem(Item item) { 
        itens.add(item); 
    } 
     
    public void removerItem(Item item) { 
        itens.remove(item); 
    } 
    public String getDescricoesItens(){
        String resultado = "";
        for (Item itemAtual : getItens()){
            resultado += String.format("%s,", itemAtual.getDescricao());
        }
        return resultado.isEmpty() ?resultado : resultado.substring(0, resultado.length () -1);
    }
    public Item getItemMaisPopuloso(){
        Item maisPopuloso = null;
        int maiorQuantidade = 0;
        for (Item itemAtual : getItens()){
            if (itemAtual.getQuantidade() > maiorQuantidade){
                maisPopuloso = itemAtual;
                maiorQuantidade = itemAtual.getQuantidade();
    
        }
        return maisPopuloso;
        }
    }
}  