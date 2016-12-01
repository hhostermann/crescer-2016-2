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
public class GeneroDao extends AbstractDao<Genero, Long> {

    final EntityManager entityManager;

    public GeneroDao(EntityManager entityManager) {
        super(Genero.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Genero> findAll() {
        return this.getEntityManager().createQuery("select g from GENERO g").getResultList();
    }

}
