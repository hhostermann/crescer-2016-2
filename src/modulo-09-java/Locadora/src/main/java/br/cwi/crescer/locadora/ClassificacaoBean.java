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
public class ClassificacaoBean extends AbstractDao<Classificacao, Long> {

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public ClassificacaoBean() {
        super(Classificacao.class);
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
