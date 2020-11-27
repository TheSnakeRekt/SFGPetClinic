package spring.guru.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Vet;
import spring.guru.petclinic.services.OwnerService;
import spring.guru.petclinic.services.VetService;
import spring.guru.petclinic.services.map.OwnerServiceMap;
import spring.guru.petclinic.services.map.VetServiceMap;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Jimmy");
        owner1.setLastName("Wilson");
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jimmy");
        owner2.setLastName("Shimy");
        owner2.setId(2L);

        Owner owner3 = new Owner();
        owner3.setFirstName("Jimmy");
        owner3.setLastName("Neutron");
        owner3.setId(3L);

        List<Owner> owners = new ArrayList<>();

        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr");
        vet1.setLastName("Larson");
        vet1.setId(1L);


        vetService.save(vet1);
        ownerService.save(owners);

        System.out.println("Data Loaded...");
    }
}
