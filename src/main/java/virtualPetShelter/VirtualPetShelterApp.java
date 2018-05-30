package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Elvis", "silly boy", 10, 10, 10, 10);
		VirtualPet pet2 = new VirtualPet("Spot", "classic style", 10, 10, 10, 10);
		VirtualPet pet3 = new VirtualPet("Molly", "tried & true", 10, 10, 10, 10);

		myVirtualPetShelter.add(pet1);
		myVirtualPetShelter.add(pet2);
		myVirtualPetShelter.add(pet3);

		//do {
		System.out.println("Thanks for volunteering at our shelter!");

		System.out.println("This is the status of your pets:");
		myVirtualPetShelter.showPets();

		System.out.println("Try to get our happiness level to 1000.");
		System.out.println("How would you like to help?");
		System.out.println("Enter 1 - to feed all the pets");
		System.out.println("Enter 2 - to give water to all the pets");
		System.out.println("Enter 3 - to play with one of the pets");
		System.out.println("Enter 4 - to adopt one of the pets");
		System.out.println("Enter 5 - to leave a new pet at the shelter");
		String userChoice = input.next();

		if (userChoice.equals("1")) {
			myVirtualPetShelter.feedAll();
			System.out.println("Thanks for feeding us!");
		}

		else if (userChoice.equals("2")) {
			myVirtualPetShelter.waterAll();
			System.out.println("Thank You for the cool drink of water.");
		}

		else if (userChoice.equals("3")) {
			
			System.out.println("Type in the name of the pet you would like to play with.");
			
			String playPetName = input.next();
			System.out.println(playPetName + " says \"thanks for playing with me!\"");

		}

		else if (userChoice.equals("4")) {
			System.out.println("What is the name of the pet would you like to adopt?");
			String adoptPetName = input.next();
			myVirtualPetShelter.pets.remove(myVirtualPetShelter.getVirtualPet(adoptPetName));
			//myVirtualPetShelter.remove(myVirtualPet.getVirtualPet(adoptPetName));
			//myBank.close(myBank.findAccount(closeChoice));
			//pets.remove(pet.getVirtualPet(), pet);

		}

		else if (userChoice.equals("5")) {
			System.out.println("What is this pet's name?");
			String newPetName = input.next();
			System.out.println("How would you discribe " + newPetName + "?");
			String newPetDescription = input.next();
			//add a pet to map without naming the object
			myVirtualPetShelter.add(new VirtualPet(newPetName, newPetDescription, 10, 10, 10, 10));
		}
		
//		int tick = 0;
//		myVirtualPetShelter.tick += 1;
//		myVirtualPetShelter.tick();
//
//		input.close();
//	} while (myVirtualPetShelter.gethappiness < 100);

}}
