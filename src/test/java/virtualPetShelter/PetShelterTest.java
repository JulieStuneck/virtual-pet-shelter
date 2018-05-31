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
		pet1 = new VirtualPet("Elvis", "wiggley boy", 10, 10, 10, 10);
		pet2 = new VirtualPet("Spot", "a true classic", 20, 20, 20, 20);

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
		// or assertThat(allPets, containsInAnyOrder(pet1, pet2)); - (comment from
		// video)
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
	public void ReduceHungerForAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.feedAll();
		int check = pet1.getHunger();
		assertEquals(8, check);
		int check2 = pet2.getHunger();
		assertEquals(18, check2);
	}

	@Test
	public void ShouldBeAbleToReduceThirstAfterWaterAll() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.waterAll();
		int check = pet1.getThirst();
		assertEquals(8, check);
		int check2 = pet2.getThirst();
		assertEquals(18, check2);
	}

	@Test
	public void AllSleepinessShouldIncreaseBy5WithPlay() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.playAll();
		int check = pet1.getSleepiness();
		assertEquals(15, check);
		int check2 = pet2.getSleepiness();
		assertEquals(25, check2);

	}

	@Test
	public void TickShouldIncreaseHappinessBy10() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.tick();
		int check = pet1.getHappiness();
		assertEquals(20, check);
		int check2 = pet2.getHappiness();
		assertEquals(30, check2);
	}

	@Test
	public void PlayShouldChangeOnePetsVariables() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.playOne();
		int check = pet1.getSleepiness();
		assertEquals(15, check);
		int check2 = pet2.getSleepiness();
		assertEquals(25, check2);
	}
	
	@Test
	public void ShowPetsHppiness() {
		underTest.add(pet1);
		underTest.reportHappiness();
		int check = pet1.getHappiness();
		assertEquals(10, check);
		
	}
}
