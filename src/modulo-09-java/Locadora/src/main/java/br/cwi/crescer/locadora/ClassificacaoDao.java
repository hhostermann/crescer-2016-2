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
public class ClassificacaoDao extends AbstractDao<Classificacao, Long> {

    final EntityManager entityManager;

    public ClassificacaoDao(EntityManager entityManager) {
        super(Classificacao.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Classificacao> findAll() {
        return getEntityManager().createQuery("select c from CLASSIFICACAO c").getResultList();
    }

}
