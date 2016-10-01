
public class Elfo
{
   
    private String nome;
    private Item arco;
    private Item flecha;
    public Elfo(String n)
    {
       nome = n;
       this.arco = new Item("Arco",1);
       this.flecha = new Item("Flecha", 42);
    }
    public String getNome(){
        return nome;
    }
    

}
