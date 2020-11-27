package spring.guru.petclinic.services;

import java.util.List;
import java.util.Set;


public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    List<T> save(List<T> objects);

    void delete (T object);

    void deleteById(ID id);
}
