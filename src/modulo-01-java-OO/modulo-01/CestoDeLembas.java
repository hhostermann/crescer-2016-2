public class CestoDeLembas
{
    private int numeroLembas;

    public CestoDeLembas(int numeroLembas){
        // inicializa variáveis de instância
        this.numeroLembas = numeroLembas;
    }
    public boolean dividirLembas(){
        return numeroLembas > 2 && numeroLembas % 2 == 0 && numeroLembas <=100;
    }
}
