import java.util.ArrayList;
public class HobbitContador{
    public int calcularDiferenca(ArrayList<ArrayList<Integer>> lista){
        int[] produtoDosPares = new int [lista.size()];
        int [] mmcDosPares = new int [lista.size()];
        int somaDosProdutos = 0;
        int somaDosMmc = 0;
        int resto = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<lista.size(); i++){
            for (int j=0; j<lista.size(); j++){
                if( j==1){
                    int nodoAtual = lista.get(i).get(j-1);
                    int nodoPosterior = lista.get(i).get(j);
                    mmcDosPares[i] = calcularMmc(nodoAtual,(nodoPosterior));
                }
            }
        }
        for (int i=0; i< lista.size(); i++){
            for (int j=0; j<2 ; j++){
               int nodoAtual = lista.get(i).get(j);
               if (j==0){
                   produtoDosPares[i] = nodoAtual;
                }
               else{
                   produtoDosPares[i] *= nodoAtual;
                }
            }
        }
        for (int i=0; i<lista.size();i++){
            somaDosProdutos += produtoDosPares[i];
            somaDosMmc += mmcDosPares[i];
        }
        return somaDosProdutos - somaDosMmc;
    }
    public int calcularMmc(int nodoAtual, int nodoPosterior){
        int x = nodoAtual;
        int y = nodoPosterior;
        int resto = 0;
        do{
            resto = x%y;
            x = y;
            y = resto;
        }while(resto!=0);
        return (nodoAtual * nodoPosterior) / x;
    }
    public int obterMaiorMultiploDeTresAte(int numeroInformado){
        int maiorNumero = 0;
        for (int i=0; i<numeroInformado; i++){
            if (numeroInformado % 3 == 0){
                 maiorNumero = i; 
            }
        }
        return maiorNumero;
    }
     public ArrayList<Integer> obterMultiplosDeTresAte(int numero) {
        ArrayList<Integer> multiplosDeTres = new ArrayList<>();   
        for (int i = 0; i <= numero; i++){
           if (i % 3 == 0) {
               multiplosDeTres.add(i);
            }
        }
        return multiplosDeTres;
    }     
}
// http://www.javaprogressivo.net/2012/09/array-multidimensional-ou-matriz-array_6673.html
//http://www.devfuria.com.br/logica-de-programacao/mmc/
//http://brasilescola.uol.com.br/matematica/produto-soma-pela-diferenca.htm
