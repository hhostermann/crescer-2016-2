/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author henrique.ostermann
 */
@Stateless
public class FilmeBean extends AbstractDao<Filme, Long> {

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public FilmeBean() {
        super(Filme.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Filme> findAll() {
        return this.getEntityManager().createQuery("select f from Filme f").getResultList();
    }

}
