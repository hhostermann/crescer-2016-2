import java.util.ArrayList;
import java.util.Arrays;
public class Exercito{  
    
    private ArrayList<Elfo> exercito = new ArrayList<>();  
    
    private ArrayList<Elfo> porStatus = new ArrayList<>();

    public void alistamentoMilitar(Elfo elfo) { 
        boolean alistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if (alistar){
            exercito.add(elfo);
        }
    } 
    public ArrayList<Elfo> getExercito() { 
        return this.exercito; 
    } 

    public Elfo buscar(String nome) {
        Elfo elfoRetorno = null;
        for(Elfo elfo : exercito){
            if (elfo.getNome() == nome){
                elfoRetorno = elfo;
                break;
            }
        }
        return elfoRetorno;
    }
    public ArrayList<Elfo> buscar(Status status) {
        porStatus = new ArrayList<Elfo>();
        for(Elfo elfo : exercito){
            if (elfo.getStatus() == status){
                porStatus.add(elfo);
            }
        }
        return porStatus;
    }
}