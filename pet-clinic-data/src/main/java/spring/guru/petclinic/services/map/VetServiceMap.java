package spring.guru.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Vet;
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
        return super.save(object);
    }

    @Override
    public List<Vet> save(List<Vet> objects) {
        return super.save(objects);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

}
