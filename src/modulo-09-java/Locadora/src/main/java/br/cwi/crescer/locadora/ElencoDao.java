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
public class ElencoDao extends AbstractDao<Elenco, Long> {

    final EntityManager entityManager;

    public ElencoDao(EntityManager entityManager) {
        super(Elenco.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Elenco> findAll() {
        return getEntityManager().createQuery("select e from ELENCO e").getResultList();
    }

}
