package edu.icet.demo.dao;

import java.util.List;

public interface CrudDao<T> extends SuperDao{
    List<T> get();
    T search(String id);
    boolean save(T dao);
    boolean update(T dao);
    boolean delete(String id);
}
