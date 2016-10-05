import java.util.ArrayList;
import java.util.Arrays;
public abstract class Exercito{  
    
    private ArrayList<Elfo> elfos; 
 
    public Exercito() { 
        elfos = new ArrayList<>(); 
        
     } 
     
    public ArrayList<Elfo> getElfos() { 
        return elfos; 
    } 
    public void adicionarElfo(Elfo elfo){
        elfos.add(elfo);
       
    }
    public void removerElfo(Elfo elfo) { 
        elfos.remove(elfo); 
    } 
    
    abstract void alistamentoMilitar(Elfo elfo);
    
}

/*poliformismo pro personagem

puxa pro elfo

e no elfo tu coloc
e dai nos outros tu puxa
    public Inventario() {
    public String getDescricoesItens(){
        String resultado = "";
        for (Item itemAtual : getItens()){
            resultado += String.format("%s,", itemAtual.getDescricao());
        }
        return resultado.isEmpty() ?resultado : resultado.substring(0, resultado.length () -1);
    }*/