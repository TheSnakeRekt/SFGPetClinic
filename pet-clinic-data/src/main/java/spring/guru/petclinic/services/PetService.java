package spring.guru.petclinic.services;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Pet;

import java.util.List;

public interface PetService extends CrudService<Pet,Long>{
    void save(List<Pet> objects);
}
