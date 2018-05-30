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

		System.out.println("Thanks for volunteering at our shelter!");

		System.out.println("Here's who we have in the shelter today:");
		
		
		
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
		
		else if(userChoice.equals("2")) {
			myVirtualPetShelter.waterAll();
		}
		
		else if(userChoice.equals("3")) {
			
		}
		
		else if (userChoice.equals("4")) {
			System.out.println("What is the name of the pet would you like to adopt?");
			String odoptPetName = input.next();
			myVirtualPetShelter.remove(odoptPetName);
			
		}
		
		else if (userChoice.equals("5")) {
			System.out.println("What is this pet's name?");
			String newPetName = input.next();
			System.out.println("How would you discribe " + newPetName + "?");
			String newPetDescription = input.next();
			VirtualPet pet4 = new VirtualPet(newPetName, newPetDescription, 10, 10, 10, 10);	
		}
		
		
		input.close();
	}

}
