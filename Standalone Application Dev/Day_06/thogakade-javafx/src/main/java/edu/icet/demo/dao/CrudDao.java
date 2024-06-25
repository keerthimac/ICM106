package edu.icet.demo.dao;

public interface CrudDao<T> extends SuperDao{
    boolean save(T dto);
    boolean delete(T id);
}