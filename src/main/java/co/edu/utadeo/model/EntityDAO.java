package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public interface EntityDAO<E> {

    void create(E entity);

    void update(E entity);

    List<E> findAll();

    E findOne(Integer key);

    void deleteOne(Integer key);

}
