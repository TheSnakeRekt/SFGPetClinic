package spring.guru.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.guru.petclinic.model.Owner;
import spring.guru.petclinic.model.Vet;
import spring.guru.petclinic.services.OwnerService;
import spring.guru.petclinic.services.VetService;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Jimmy");
        owner1.setLastName("Wilson");

        Owner owner2 = new Owner();
        owner2.setFirstName("Jimmy");
        owner2.setLastName("Neutron");

        Owner owner3 = new Owner();
        owner3.setFirstName("Jimmy");
        owner3.setLastName("Shimy-o");

        List<Owner> owners = new ArrayList<>();

        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr");
        vet1.setLastName("Larson");


        vetService.save(vet1);
        ownerService.save(owners);

        System.out.println("Data Loaded...");
    }
}
