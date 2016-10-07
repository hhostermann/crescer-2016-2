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
    public void ordenarItens() {
        ordenarItens(TipoOrdenacao.ASCENDENTE);

    }

    public void ordenarItens() {
        ordenarItens(TipoOrdenacao.ASCENDENTE);
    }

    public void ordenarItens(TipoOrdenacao tipoOrdenacao) {
        // Versão mais estável do Bubblesort - Melhor caso O(n), Pior caso O(n^2)
        // homenagem ao do-while: para forçar entrada na lógica
        boolean posicoesSendoTrocadas;
        boolean ascendente = tipoOrdenacao == TipoOrdenacao.ASCENDENTE;
        do {

            posicoesSendoTrocadas = false;

            for (int j = 0; j < this.itens.size() - 1; j++) {

                Item itemAtual = this.itens.get(j);

                Item proximo = this.itens.get(j + 1);


                boolean precisaTrocar = 
                    ascendente ? itemAtual.getQuantidade() > proximo.getQuantidade() : itemAtual.getQuantidade() < proximo.getQuantidade();


                    ascendente ? itemAtual.getQuantidade() > proximo.getQuantidade() : itemAtual.getQuantidade() < proximo.getQuantidade();


                if (precisaTrocar) {

                    this.itens.set(j, proximo);

                    this.itens.set(j + 1, itemAtual);

                    posicoesSendoTrocadas = true;
                }
            }
        } while (posicoesSendoTrocadas);

    }
}




