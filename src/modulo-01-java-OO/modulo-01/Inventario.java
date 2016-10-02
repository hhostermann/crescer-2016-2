import java.util.ArrayList;
import java.util.Arrays;
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
    public void aumentarUnidadesItens(int quantidade) {
        for(Item itemAtual : getItens()){
            itemAtual.setQuantidade(quantidade + itemAtual.getQuantidade());
        }
    }
    public void somarUnidadesItens(){
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
                itemAtual.setQuantidade ((1000 * soma) + retorno);
            }
            else {
                itemAtual.setQuantidade ((1000 * soma) + retorno);
            }
        }
    }       
    public void ordenarItensAscedentes() {
        for(int i = 0; i < (itens.size() - 1); i++) {
            if(itens.get(i).getQuantidade() > itens.get(i + 1).getQuantidade()) {
                Item aux = itens.get(i);

                itens.set(i, itens.get(i + 1));

                itens.set(i + 1, aux);
            }
        }
    }

    public void ordenarItensDescedentes() {
        for(int i = (itens.size() - 1); i > 0; i--) {
            if(itens.get(i).getQuantidade() > itens.get(i - 1).getQuantidade()) {
                Item aux = itens.get(i);

                itens.set(i, itens.get(i - 1));

                itens.set(i - 1, aux);
            }
        }
    }

    public void ordenarItens(TipoOrdenacao tipo) {

        for(int x = 0; x < itens.size(); x++) {
            if (tipo == TipoOrdenacao.ASCEDENTE) {
                ordenarItensAscedentes();
            } else {
                ordenarItensDescedentes();
            }
        }
    }
}  