public class CestoDeLembas{
    private int numeroLemba;
    
    public CestoDeLembas(int numeroLemba){
        this.numeroLemba=numeroLemba;
    }
    public boolean dividirPar(){
        return numeroLemba > 2 && numeroLemba % 2 == 0 && numeroLemba <= 100;
    }
    
}
