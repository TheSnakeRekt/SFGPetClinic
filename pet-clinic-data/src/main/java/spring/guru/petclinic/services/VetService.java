package spring.guru.petclinic.services;

import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Vet;

import java.util.List;
import java.util.Set;

public interface VetService extends CrudService<Vet,Long>{
    void save(List<Vet> objects) ;
}
