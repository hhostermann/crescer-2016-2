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
public class AtorBean extends AbstractDao<Ator, Long> {

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public AtorBean() {
        super(Ator.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Ator> findAll() {
        return this.getEntityManager().createQuery("select a from ATOR a").getResultList();
    }

}
