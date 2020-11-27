package spring.guru.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Vet;
import spring.guru.petclinic.services.CrudService;
import spring.guru.petclinic.services.VetService;

import java.util.List;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService{
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void save(List<Vet> objects) {
        objects.forEach(object-> super.save(object.getId(),object));
    }
}
