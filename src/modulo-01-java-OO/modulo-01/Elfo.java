
public class Elfo
{
  /*

Criar atributo experiencia e aumentá-la a cada chamada de atirarFlecha().*/
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    
    public Elfo (String n) { 
        nome = n; 
        arco = new Item("Arco", 1); 
        flecha = new Item("Flecha", 42);
    }
    public String getNome(){
        return nome;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public void atirarFlecha(){
        experiencia++;
    }
    

}
