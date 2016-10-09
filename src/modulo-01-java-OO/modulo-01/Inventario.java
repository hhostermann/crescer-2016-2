import java.util.ArrayList; 
public class Inventario {
    private ArrayList<Item> inventario = new ArrayList<>();
    private TipoOrdenacao tipo;
    
    public ArrayList<Item> getItem(){//retorna inventario
        return inventario;
    }
    public void adicionarItem(Item item){ //adiciona item
        inventario.add(item);
    }
    public void removerItem(Item item){//remove item
        inventario.remove(item);
    }
    public String getDescricoesItens(){ // retorna o nome dos itens separados por ","
        String retorno = ""; 
        for (Item itemAtual : getItem()){
            retorno += String.format("%s, ", itemAtual.getDescricao());
        }
        return retorno.isEmpty() ? retorno : retorno.substring(0, retorno.length () -2);
        }
    public void AumentarQuantidadeItens(int quantidade){ //aumenta a quantidade do item 
        for (Item itemAtual : getItem()){
            itemAtual.setQuantidade(quantidade + itemAtual.getQuantidade());
       }
       }   
    public Item itemMaiorQuantidade(){ //pega numero que tem maior quantidade no inventario 
        Item maiorItem = null;
        for (Item itemAtual : getItem()) { 
            if (itemAtual.getQuantidade()< maiorItem.getQuantidade()){
                maiorItem  = itemAtual;                     
        }
        }
        return maiorItem;
    }
    public void ordenarItens(TipoOrdenacao tipo){
        Item reserva;
        for(int i=inventario.size()-1; i>= 1; i--){  
            for(int j=0; j<i ; j++){
                if(tipo == TipoOrdenacao.ASCENDENTE){
                    if(inventario.get(j).getQuantidade()>inventario.get(j+1).getQuantidade()){
                        reserva = inventario.get(j);
                        inventario.set(j, inventario.get(j+1));
                        inventario.set(j+1, reserva);
                    }
                }
                else if(tipo == TipoOrdenacao.DESCENDENTE){
                    if(inventario.get(j).getQuantidade()<inventario.get(j+1).getQuantidade()){
                        reserva = inventario.get(j);
                        inventario.set(j, inventario.get(j+1));
                        inventario.set(j+1, reserva);
                    }
                }
            }
        }
    }
    public void aumentarQuantidadePorItem() {
        for (Item itens : this.inventario) {
            itens.aumentarQuantidade();
        }
    }
    public Item buscar(String descricao){
        Item resultado = null;
        for(int i=0; i<inventario.size(); i++){
            Item itemAtual = inventario.get(i);
            if(descricao.equals(itemAtual.getDescricao())){ //n comparar com ==
                resultado = itemAtual;
                break;
            }
        }
        return resultado;
    }
    public double getMediaQuantidades(){
        int somador = getSomatorioQuantidades (), sizeInventario = inventario.size();
        double media = 0;
        return media = somador / sizeInventario; 
    }   
    public int getSomatorioQuantidades (){
        int somador  = 0;
        for(int i=0; i<inventario.size(); i++){
            int quantidadeItemAtual = inventario.get(i).getQuantidade();
            somador += quantidadeItemAtual;
        }
        return somador;
    }
    public Inventario unir(Inventario inventario){
        ArrayList<Item> itemInventario = inventario.getItem();
        Inventario resultado = new Inventario();
        for(int i=0; i<this.inventario.size(); i++){
            Item itemAtual = this.inventario.get(i);
            resultado.adicionarItem(itemAtual);
        }
        for(int i=0; i<itemInventario.size(); i++){
            Item itemAtual = itemInventario.get(i);
            resultado.adicionarItem(itemAtual);
        }
        return resultado;
    }
    public Inventario diferenciar(Inventario inventario){
        ArrayList<Item> itemInventarioRecebido = inventario.getItem();
        Inventario resultado = new Inventario();
        for(int i=0; i<this.inventario.size(); i++){
            boolean verdadeiro = false;
            Item itemAtual = this.inventario.get(i);
            for(int j=0; j<itemInventarioRecebido.size(); j++){
                if(itemAtual.getDescricao() == itemInventarioRecebido.get(j).getDescricao()){
                    verdadeiro = true;
                    break;
                }
            }      
            if(!verdadeiro)
                resultado.adicionarItem(itemAtual);
        }
        return resultado;
    }
    public Inventario cruzar(Inventario inventario){
        ArrayList<Item> itemInventarioRecebido = inventario.getItem();
        Inventario resultado = new Inventario();
        for(int i=0; i<this.inventario.size(); i++){
            boolean tem = false;
            Item itemAtual = this.inventario.get(i);
            for(int j=0; j<itemInventarioRecebido.size(); j++){
                if(itemAtual.getDescricao() == itemInventarioRecebido.get(j).getDescricao()){
                    resultado.adicionarItem(itemAtual);
                }
            }      
        }
        return resultado;
    }
}