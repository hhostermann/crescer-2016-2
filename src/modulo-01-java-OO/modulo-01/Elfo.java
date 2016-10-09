public class Elfo
{
    private String nome;
    private Item arco;
    private Item flecha;
    private int xP;
    
    public Elfo(String nome){
        this.nome = nome;
        arco = new Item("arco", 1);
        flecha = new Item ("flecha", 42);
    }
    public void atirarFlecha(Dwarf dwarf){
        int flechaNum = flecha.getQuantidade();
        if (flechaNum > 0 ){
            dwarf.perderVida();
            xP++;
           flechaNum--;
        }   
        flecha.setQuantidade(flechaNum);
    }
    public Item getFlecha(){
        return flecha;
        }
    public String toString(){
        int xpAtual;
        int flechaAtual;
        flechaAtual = flecha.getQuantidade();
        xpAtual = xP;
        boolean xpSing = xpAtual == 0 && xpAtual == 1;
        boolean flechaSing = flechaAtual == 1;
        return String.format ("%s possui %d %s e %d %s de experiência.", this.nome, flechaAtual, flechaSing ? "flecha" : "flechas",
                                                                     xpAtual, xpSing ? "nível" : "níveis");
    }
                                                                             
    
   
    } 