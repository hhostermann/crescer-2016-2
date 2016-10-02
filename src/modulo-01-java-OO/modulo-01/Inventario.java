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
        }
        return maisPopuloso;
    }
    public void somarUnidadeItens(){
        int soma = 0;
        for (Item itemAtual : getItens()){
            int retorno = itemAtual.getQuantidade();
            boolean positivo = retorno > 0;
            int somaQuantidade = (1000 * soma) + retorno;
            if (!positivo){
                retorno = Math.abs(retorno);
            }
            for (int i = 0; i <= retorno; i++){
                soma += i;
            }
            //positivo == true ? itemAtual.setQuantidade (somaQuantidade) : itemAtual.setQuantidade (somaQuantidade);
            if (positivo){
                itemAtual.setQuantidade (somaQuantidade);
            }
            else {
                itemAtual.setQuantidade (somaQuantidade);
            }
        }
    }
}  