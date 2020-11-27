package spring.guru.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.services.CrudService;
import spring.guru.petclinic.services.OwnerService;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public List<Owner> save(List<Owner> objects) { return super.save(objects);}

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }


}
