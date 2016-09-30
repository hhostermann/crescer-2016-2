import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> itens;
    private ArrayList<Item> ordem;

    public Inventario() {
        itens = new ArrayList<>();
        ordem = new ArrayList<>();
    }
    
    public ArrayList<Item> getOrdem() {
        return ordem;
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
    public void ordenarItens(Inventario armazenaQantidade,int i, int u, int l,t, int contador, int cont){
        
            for (u=0;u>itens.size();u++){
                 for (i=0;i>itens.size();i++){
                     contador = itens.get(i).getQuantidade();
                        if (cont < contador){
                            cont = contador;
                            l=i;
            }
            ordem.add(itens.get(l));
                if (itens.get(i).getQuantidade() > ordem.get(i).getQuantidade() &&  ordem.get(i).getQuantidade() < itens.get(i+1).getQuantidade() ){
                    contador = t+1;
                    ordem.add(itens.get(contador));
                }
            }
            
      
    }}
    public String getDescricoesItens() {
        //"Adaga,Escudo,Bracelete"
        String resultado = "";

        /*for (int i = 0; i < itens.size(); i++) {
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        }*/

        /*int i = 0;
        while (i < itens.size()) {
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        i++;
        }*/

        /*int i = 0;
        do {;
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        i++;
        } while (i < itens.size());*/

        for (Item itemAtual : itens) {
            resultado += String.format("%s,", itemAtual.getDescricao());
        }

        return resultado.isEmpty() ? resultado : resultado.substring(0, resultado.length() - 1);
    }
    
    public void aumentarUnidadesDosItens(int unidades) {
        for (Item item : itens) {
            item.aumentarUnidades(unidades);
        }
    }
    
}

