package com.br.lp3.model.dao;

import java.util.List;

/**
 *
 * @author 31431038
 */
public interface GenericDAO {
    //CRUD 
    public boolean Insert(Object object);
    public List<Object> read();
    public boolean update(Object object);
    public boolean remove(Object object);
}
