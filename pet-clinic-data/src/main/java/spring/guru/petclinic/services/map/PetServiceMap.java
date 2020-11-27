package spring.guru.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Pet;
import spring.guru.petclinic.model.Vet;
import spring.guru.petclinic.services.CrudService;
import spring.guru.petclinic.services.PetService;

import java.util.List;
import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public List<Pet> save(List<Pet> objects) { return super.save(objects); }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
