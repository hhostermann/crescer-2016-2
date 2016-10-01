
/*
 Permitir que Elfos atirem flechas em Dwarves (anões)
 Lembrem-se que um Dwarf nasce com 110 unidades de vida e perde 10 a cada flechada.
 */
public class Dwarf
{
    private int vida;
    public Dwarf()
    {
        vida=110;
    }
    public void perdeVida()
    {
        vida-=10;
    }
    public int getVida(){
        return vida;
    }
    
}
