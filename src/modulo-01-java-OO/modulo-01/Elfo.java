public class Elfo { 
    private String nome; 
    private Item arco; 
    private Item flecha;
    private Dwarf anao;
    private int experiencia; 
    private int contador;
    public Elfo(String n) { 
        nome = n; 
        arco = new Item("Arco", 1); 
        flecha = new Item("Flecha", 42); 
    } 
    public void setNome(String n) { 
        nome = n; 
    }  
    public String getNome() { 
        return nome; 
    } 
    public Item getArco() { 
        return arco; 
    }
    public Item getFlecha() { 
        return flecha; 
    } 
    public void atirarFlecha() { 
        if (flecha.getQuantidade() >= 0 ){
            flecha.setQuantidade(flecha.getQuantidade() - 1);
            anao.setPontosDeVida(anao.getPontosDeVida() - 10);
            experiencia++; 
        }
        else{
            System.out.println("Acabaram as Flechas");
        }
    }
}