package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService<P, L extends Number> extends CrudService<Pet,Long> {

}
