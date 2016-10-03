import java.util.ArrayList;
public class HobbitContador
{
    public int calcularDiferenca(ArrayList<ArrayList<Integer>> lista){
        int[] produtoPares = new int [lista.size()];
        for(int i = 0; i < lista.size(); i++){
            for(int u = 0; u < 2; u++){
                int numeroAtual = lista.get(i).get(u);
                if(u==0)
                    produtoPares[i]= numeroAtual;
                else
                    produtoPares[i]*= numeroAtual;
            }
        }
        int somaProdutos = 0;
        for (int i = 0; i < lista.size(); i++){
            somaProdutos += produtoPares[i];
        }
        int[] mmcPares = new int[lista.size()];    
        int sobra = 0;
        int a = 0;
        int b = 0;    
        for(int i = 0; i < lista.size(); i++){
            for(int u=0; u < 2; u++){
                if(u==1){
                    int numeroAtual = lista.get(i).get(u-1);
                    int numeroPosterior  = lista.get(i).get(u);
                    mmcPares[i] = calculaMmc(numeroAtual, numeroPosterior);
                }
            }
        }
        int somaMmc = 0;
        for (int i=0; i<lista.size(); i++){
            somaMmc += mmcPares[i];
        }
        return somaProdutos - somaMmc;
    }

    public int calculaMmc(int numeroAtual, int numeroPosterior){
        int a = numeroAtual;
        int b = numeroPosterior;
        int sobra = 0;
        do{
            sobra = a % b;
            a = b;
            b = sobra;
        }while(sobra!=0);

        return (numeroAtual * numeroPosterior)/a;
    }
}