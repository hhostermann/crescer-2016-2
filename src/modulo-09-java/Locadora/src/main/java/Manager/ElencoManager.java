/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import br.cwi.crescer.locadora.Elenco;
import br.cwi.crescer.locadora.ElencoBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henrique.ostermann
 */
@ManagedBean
@ViewScoped
public class ElencoManager {
    @EJB
    private ElencoBean elencoBean;
    private Elenco elenco;
    private List<Elenco> elencos;
    @PostConstruct
    public void init(){
        this.elenco = new Elenco();
        this.elencos = elencoBean.findAll();
        this.elencos.sort((a,b)->a.getIdElenco().compareTo(b.getIdElenco()));
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public List<Elenco> getElencos() {
        return elencos;
    }

    public void setElencos(List<Elenco> elencos) {
        this.elencos = elencos;
    }
            
    
}
