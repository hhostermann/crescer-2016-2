
public class Item{
    private String descricao;
    private int quantidade;
    
    public Item(String descricao, int quantidade)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    public void setDescricao (String novaDescricao){
        this.descricao = novaDescricao;
    }
    public void aumentarUnidades(int unidades) {
        quantidade += unidades;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    
    }
    @Override 
    public boolean equals(Object obj) { 
        Item outro = (Item)obj; 
        return 
            this.descricao.equals(outro.descricao) && 
            this.quantidade == outro.quantidade; 
    } 
}
