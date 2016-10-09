public class Item{
   private String descricao;
   private int quantidade;  
    public Item(String descricao, int quantidade){
        this.quantidade = quantidade;
        this.descricao = descricao;
   }
   public String getDescricao(){
        return descricao;
     }
   public int getQuantidade(){
        return quantidade;
    }
   public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
   public void aumentarQuantidade() {          //copiado do bitKraken. motivo: n consegui forma melhor de tirar o sinal negativo
        int quantidadeTotal= Math.abs(this.quantidade);
        int resultado = quantidadeTotal * (quantidadeTotal + 1) / 2;
        this.quantidade += (resultado * 1000);
      
    }
}