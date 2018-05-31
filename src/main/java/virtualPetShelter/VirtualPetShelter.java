package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

	public void showPets() {
		for (VirtualPet current : pets.values()) {
			System.out.println(current.getVirtualPet() + ": " + current.getDescription() + "; Hunger level = "
					+ current.getHunger() + "; Thurst level = " + current.getThirst() + "; Happiness level = "
					+ current.getHappiness() + "; Sleepiness level = " + current.getSleepiness());

		}
	}

	public void feedAll() {
		for (VirtualPet pet : pets.values()) {
			pet.feed();
		}

	}

	public void waterAll() {
		for (VirtualPet pet : pets.values()) {
			pet.water();
		}

	}

	public void playAll() {
		for (VirtualPet pet : pets.values()) {
			pet.play();
		}

	}

	public void tick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}

	}

	public void playOne() {
		
		pets.play(pet.getVirtualPet(), pet);
		
	}
		
//		Set<String> name = pets.keySet();
//		for (pets.keySet().equals(name);;) {
//			((VirtualPet) name).play();
		
		//pets.keySet().play();
		
//		pets.keySet().equals(name);
//		((VirtualPet) name).play();
		
//		for (pets.keySet().equals(name);;) {
//			((VirtualPet) name).play();
		
	

	public void reportHappiness() {
		for (VirtualPet pet : pets.values()) {
			pet.getHappiness();
		}
		
	}}

