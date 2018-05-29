package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>();
	
	public void add(VirtualPet pet) {
		pets.put(pet.getVirtualPet(), pet);
		
	}

	public VirtualPet findPet(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void remove(VirtualPet pet) {
		pets.remove(pet.getVirtualPet(), pet);
	}

	public void reduceHunger() {
		VirtualPet subtractFromHunger = pets.values(hunger);
		hunger -= hunger;
		
	}
//	for(Entry<String, String> entry: students.entrySet()) {
//	  System.out.println("The student's id is " + entry.getKey());
//	  System.out.println("The student's name is " + entry.getValue());
//
//Collection<String> studentNames = students.values();
//System.out.println("The student names are " + studentNames);


	
}
