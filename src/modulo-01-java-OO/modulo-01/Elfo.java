
public class Elfo
{
   
    private String nome;
    private Item arco;
    private Item flecha;
    public Elfo (String n) { 
        nome = n; 
        arco = new Item("Arco", 1); 
        flecha = new Item("Flecha", 42);
    }
    public String getNome(){
        return nome;
    }
    

}
