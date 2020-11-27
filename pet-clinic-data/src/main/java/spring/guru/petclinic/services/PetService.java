package spring.guru.petclinic.services;
import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Pet;

import java.util.List;

@Service
public interface PetService extends CrudService<Pet,Long>{
    void save(List<Pet> objects);
}
