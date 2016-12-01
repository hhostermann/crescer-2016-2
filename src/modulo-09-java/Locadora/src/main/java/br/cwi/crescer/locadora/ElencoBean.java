/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author henrique.ostermann
 */
public class ElencoBean extends AbstractDao<Elenco, Long> {

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public ElencoBean() {
        super(Elenco.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Elenco> findAll() {
        return this.getEntityManager().createQuery("select e from ELENCO e").getResultList();
    }

}
