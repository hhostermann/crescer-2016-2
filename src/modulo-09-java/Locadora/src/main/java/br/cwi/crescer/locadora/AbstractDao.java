/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import javax.persistence.EntityManager;

/**
 *
 * @author henrique.ostermann
 * @param <T>
 * @param <ID>
 */
public abstract class AbstractDao<T, ID> implements IDao<T, ID> {

    public abstract EntityManager getEntityManager();
    private final Class<T> classe;

    public AbstractDao(Class<T> classe) {
        this.classe = classe;
    }
    @Override
    public T find(ID id){
        return this.getEntityManager().find(classe, id);
    }
    @Override
    public void insert (T t){
        this.getEntityManager().merge(t);
    }
    @Override
    public void delete(T t){
        this.getEntityManager().remove(t);
    }
}

