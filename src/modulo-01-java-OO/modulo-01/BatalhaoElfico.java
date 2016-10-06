import java.util.*;
import java.util.HashMap;
public class BatalhaoElfico {
    HashMap<Integer, Elfo> batalhao = new HashMap<Integer, Elfo>();
    private HashMap<Status, ArrayList<Elfo>> porStatus;
    public void alistamentoMilitar(Elfo elfo) { 
        boolean alistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        int ibgeElfico = elfo.getContadorDeElfos();
        
        if (alistar){
            this.batalhao.put(ibgeElfico, elfo);
        }
    }
        public HashMap<Integer, Elfo> getBatalhao(){
       return this.batalhao;
    }
      public Elfo buscar(Integer contadorDeElfos  ) {
        return batalhao.get(contadorDeElfos);
    }
    public void agruparPorStatus() {
        HashMap<Status, ArrayList<Elfo>> porStatus = new HashMap<>();
        porStatus.clear();
        for(Integer ibgeElfico : this.batalhao.keySet()){
            Elfo elfo = this.batalhao.get(ibgeElfico);
            ArrayList<Elfo> statusElfo = this.porStatus.get(elfo.getStatus());
            if(statusElfo==null){
                statusElfo = new ArrayList<Elfo>();
                this.porStatus.put(elfo.getStatus(), statusElfo);
            }
            
            statusElfo.add(elfo);
        }
    }
}
