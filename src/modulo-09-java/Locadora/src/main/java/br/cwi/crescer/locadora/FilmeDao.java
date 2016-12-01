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
public class FilmeDao extends AbstractDao<Filme, Long> {
    final EntityManager entityManager;
    public FilmeDao(EntityManager entityManager){
        super(Filme.class);
        this.entityManager = entityManager;
    }
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Filme> findAll() {
        return this.getEntityManager().createQuery("select f from FILME f").getResultList();
    }
    
}
