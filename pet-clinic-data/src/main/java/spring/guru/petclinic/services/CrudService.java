package spring.guru.petclinic.services;

import spring.guru.petclinic.model.Pet;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete (T object);

    void deleteById(ID id);
}
