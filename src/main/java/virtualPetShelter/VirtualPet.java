package virtualPetShelter;

public class VirtualPet {

	private String name;
	private int hunger;
	private String description;

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int happiness,
			int sleepiness) {
		this.name = name;
		this.hunger = hunger;
		this.description = description;

	}

	public String getVirtualPet() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public String getDescription() {
		return description;
	}

}
