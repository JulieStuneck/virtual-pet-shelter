package virtualPetShelter;

public class VirtualPet {

	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int happiness;
	private int sleepiness;

	public VirtualPet(String name, String description, int hunger, int thirst, int happiness, int sleepiness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.happiness = happiness;
		this.sleepiness = sleepiness;

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
	
	public int getThirst() {
		return thirst;
	}
	
	public int getHappiness() {
		return happiness;
	}
		
		public int getSleepiness() {
			return sleepiness;
		
	}

	
}
