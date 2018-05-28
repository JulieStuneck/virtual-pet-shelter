package virtualPetShelter;

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


}
