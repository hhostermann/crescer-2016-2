/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import java.util.List;

/**
 *
 * @author henrique.ostermann
 * @param <T>
 * @param <ID>
 */
public interface IDao<T, ID> {
    void insert (T t);
    void delete (T t);
    T find(ID id);
    List<T> findAll();
}
