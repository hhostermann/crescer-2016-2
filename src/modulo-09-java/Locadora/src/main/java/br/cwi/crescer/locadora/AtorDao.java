/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author henrique.ostermann
 */
public class AtorDao extends AbstractDao<Ator, Long> {

    final EntityManager entityManager;

    public AtorDao(EntityManager entityManager) {
        super(Ator.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List findAll() {
        return this.getEntityManager().createQuery("select a from ATOR a").getResultList();
    }

}
