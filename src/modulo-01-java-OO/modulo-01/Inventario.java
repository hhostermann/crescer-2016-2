import java.util.ArrayList; 
 
public class Inventario { 
    private ArrayList<Item> itens; 
    private ArrayList<Item> inventario;  
    public Inventario() { 
        itens = new ArrayList<>(); 
                inventario = new ArrayList<>(); 
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
        for (Item itemAtual : itens){
            resultado += String.format("%s,", itemAtual.getDescricao());
        }
        return resultado.isEmpty() ?resultado : resultado.substring(0, resultado.length () -1);
    }
    public void ordenarItens(){
        int i,u,contador;
        Item item;
        for (i=0; i<= itens.size(); i++){
            int numeroMenor = itens.get(i).getQuantidade();
            item = itens.get(i);
                        for (u=0; i<= itens.size();i++){
            int quantidade = itens.get(u).getQuantidade();
                if (numeroMenor >= quantidade){
                    numeroMenor =  quantidade; 
                    contador = u;
                    item =  itens.get(u);
                    itens.remove(u);
            }
            }
            inventario.add(item);
        }
        for (i=0; i<=inventario.size(); i++){
            itens.add(inventario .get(i));
        }
            
    }
} 
    