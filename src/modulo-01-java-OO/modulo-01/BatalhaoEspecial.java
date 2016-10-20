import java.util.*; 
public class BatalhaoEspecial{
    protected HashMap<String, Elfo> batalhao;
    public BatalhaoEspecial(){
        batalhao = new HashMap<>();
    }
    public HashMap<String, Elfo> getContingente(){
        return batalhao;
    }
    public void alistar(Elfo elfo){ //alistar a vaca do LoL
        boolean alistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if(alistar){
            batalhao.put(elfo.getNome(), elfo);
        }
    }
    public Elfo buscar(String nome){
        return batalhao.get(nome);
    }
    public HashMap<String, Elfo> buscarPorStatus(Status status){
        HashMap<String, Elfo> porStatus = new HashMap<>();
        
        for(String keyElfo : batalhao.keySet()){
            Elfo elfoStatus = batalhao.get(keyElfo);
            if(elfoStatus.getStatus() == status)
                porStatus.put(keyElfo, elfoStatus);

        }
        return porStatus;     
    }
}