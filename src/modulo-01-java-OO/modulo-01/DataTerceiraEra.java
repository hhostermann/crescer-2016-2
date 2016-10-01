
/*Calendário de Tolkien

3.1

Crie uma classe DataTerceiraEra com 3 campos: dia, mês e ano. 
Todos campos são inteiros. Faça os métodos getters apenas.

3.2

Adicione um construtor de instância à classe DataTerceiraEra com os 3 
campos existentes no objeto (criados no exercício anterior).

3.3

Adicione um método de instância ehBissexto() na classe DataTerceiraEra que 
retorna true caso o ano da data seja bissexto, false caso contrário.
 */
public class DataTerceiraEra
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int dia;
    private int mes;
    private int ano;

    public DataTerceiraEra(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public boolean ehBissexto(){
        return ano%400==0 || (ano%100 !=0) ? true : false ;
     
    }
}

















