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

	public String findDescription(String description) {
		return description;
	}
	// for (BankAccount current : accounts.values()) {
	// current.deposit();

	
	public void showPets() {
		for (VirtualPet current : pets.values()) {
			System.out.println(current.getVirtualPet() + " " + current.getDescription() + current.getHunger() + " "
					+ current.getThirst() + current.getHappiness() + current.getSleepiness());
		
		}
	}
}
