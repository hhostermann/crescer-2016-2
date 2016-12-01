/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import br.cwi.crescer.locadora.Filme;
import br.cwi.crescer.locadora.FilmeBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author henrique.ostermann
 */
@ManagedBean
@ViewScoped
public class FilmeManager {
    @EJB
    private FilmeBean filmeBean;
    private Filme filme;
    private List<Filme> filmes;
    @PostConstruct
    public void init(){
        this.filme = new Filme();
        this.filmes = filmeBean.findAll();
        this.filmes.sort((a,b) -> a.getIdFilme().compareTo(b.getIdFilme()));
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
    public void adicionar(){
        filmeBean.insert(filme);
        this.init();
    }
    
}
