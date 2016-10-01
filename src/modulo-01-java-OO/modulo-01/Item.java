
public class Item{
    private String descricao;
    private int quantidade;
    
    public void Item(String descricao, int quantidade)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    public String getDescricao (){
        return  descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
