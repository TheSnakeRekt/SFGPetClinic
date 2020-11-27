package spring.guru.petclinic.services.map;

import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.services.CrudService;
import spring.guru.petclinic.services.OwnerService;

import java.util.List;
import java.util.Set;

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
        return super.save(object.getId(),object);
    }

    @Override
    public void save(List<Owner> objects) {
        objects.forEach(object-> super.save(object.getId(),object));
    }

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
