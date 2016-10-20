import java.util.*;
public class ExercitoDeElfo {  
    private ArrayList<Elfo> exercito = new ArrayList<>();  
    public void alistar(Elfo elfo) { 
        boolean alistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if (alistar){
            exercito.add(elfo);
        }
    } 
    public ArrayList<Elfo> getExercitoDeElfo() { 
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
        ArrayList<Elfo> porStatus = new ArrayList<Elfo>();
        for(Elfo elfo : exercito){
            if (elfo.getStatus() == status){
                porStatus.add(elfo);
            }
        }
        return porStatus;
    }
}