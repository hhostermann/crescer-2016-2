
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
    
    public void aumentarProporcionalQuantidade() {
        /*int resultado = 0;
        for (int i = 1; i <= this.quantidade; i++) {
        resultado += i;
        }*/
        // Usando PA:
        int quantidadeAbsoluta = Math.abs(this.quantidade);
        int resultado = quantidadeAbsoluta * (quantidadeAbsoluta + 1) / 2;
        this.quantidade += (resultado * 1000);
    }
}
