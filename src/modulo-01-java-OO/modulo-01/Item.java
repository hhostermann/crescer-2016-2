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
<<<<<<< HEAD
    
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
    
    @Override
    public boolean equals(Object obj) {
        Item outro = (Item)obj;
        return
            this.descricao.equals(outro.descricao) &&
            this.quantidade == outro.quantidade;
    }
}
=======
}
>>>>>>> master
