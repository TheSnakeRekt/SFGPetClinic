package spring.guru.petclinic.services;

import org.springframework.stereotype.Service;
import spring.guru.petclinic.model.Owner;

import java.util.List;
import java.util.Set;

@Service
public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
    void save(List<Owner> object);
}
