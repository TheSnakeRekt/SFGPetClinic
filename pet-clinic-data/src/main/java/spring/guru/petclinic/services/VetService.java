package spring.guru.petclinic.services;

import spring.guru.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById();
    Vet save(Vet vet);
    Set<Vet> findAll();
}
