package spring.guru.petclinic.services;
import spring.guru.petclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
