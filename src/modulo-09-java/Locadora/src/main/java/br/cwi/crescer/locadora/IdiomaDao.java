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
public class IdiomaDao extends AbstractDao<Idioma, Long> {

    final EntityManager entityManager;

    public IdiomaDao(EntityManager entityManager) {
        super(Idioma.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Idioma> findAll() {
        return this.getEntityManager().createQuery("select i from IDIOMA i").getResultList();
    }

}
