import java.util.*;
import java.util.HashMap;
public class BatalhaoElfico {
    HashMap<Integer, Elfo> batalhao = new HashMap<Integer, Elfo>();
    private HashMap<Status, ArrayList<Elfo>> porStatus;
    private Elfo elfo;
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
                    
                        //KISband
                        
        public Elfo buscar(String nome){
        return batalhao.get(nome);
    }
    
    
    /*
    public Elfo buscar(String nome) {
        String nomePesquisar = nome;
        for(int i=0; i < this.batalhao.size(); i++){
            if (nomePesquisar == elfo.getNome()){
                int numeroElfico = elfo.getContadorDeElfos(); 
                return batalhao.get(numeroElfico);
                  break;                                                                           // TO_DO
              }
            else{
                return null;
            }
            }
            
    }*/
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
