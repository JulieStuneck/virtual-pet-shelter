package virtualPetShelter;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {

	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("Elvis", "wiggley boy", 10, 10, 10, 10, 10);
		pet2 = new VirtualPet("Spot", "a true classic", 10, 10, 10, 10, 10);

	}

	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		VirtualPet identifiedPet = underTest.findPet("Elvis");
		assertThat(identifiedPet, is(pet1));
	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		// or assertThat(allPets, containsInAnyOrder(pet1, pet2));
		assertEquals(2, allPets.size());

	}

	@Test
	public void shouldBeAbleToRemoveAPetForAdoption() {
		underTest.add(pet1);
		underTest.remove(pet1);
		VirtualPet identifiedPet = underTest.findPet(pet1.getVirtualPet());
		assertThat(identifiedPet, is(nullValue()));
	}

	@Test
	public void ReduceHungerForPet1() {
		underTest.add(pet1);
		underTest.reduceHunger((int) pet1.getHunger(), 2);
		assertThat(pet1.getHunger(), is(8));

		// VirtualPet underTest = new VirtualPet(100, 0, 0, 0, 0);
		// underTest.feed();
		// int check = underTest.getHunger();
		// assertEquals(75, check);

		// Collection<VirtualPet> allPets = underTest.getAllPets();
		// Collection<VirtualPet> allPets = underTest.reduceHunger(2);
		// assertThat(allPets.getHunger, is(8));

		// for(Entry<String, String> entry: students.entrySet()) {
		// System.out.println("The student's id is " + entry.getKey());
		// System.out.println("The student's name is " + entry.getValue());
		// }
		// Collection<String> studentNames = students.values();
		// System.out.println("The student names are " + studentNames);

	}

}
