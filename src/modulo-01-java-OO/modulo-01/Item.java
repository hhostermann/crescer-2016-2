
public class Item{
    private String descricao;
    private int quantidade;
    
    public Item(String descricao, int quantidade)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    public void getDescricao (int novaQuantidade){
        quantidade = novaQuantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    
    }
}
