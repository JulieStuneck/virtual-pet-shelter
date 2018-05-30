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
	public void ReduceHungerForAllPets() {
		VirtualPet underTest = new VirtualPet("","", 10, 10, 10, 10);
		underTest.feedAll();
		int check = underTest.getHunger();
		assert.equals(8, check);

	}
	
	@Test
	public void ShouldBeAbleToReduceThirstAfterWaterAll() {
	VirtualPet underTest = new VirtualPet("", "", 10, 10, 10, 10); 
		underTest.water(); 
		int check = underTest.getThirst(); 
		assertEquals(8, check); 


	}
	
	@Test
	public void ReturnDescriptionOfPet1() {
		underTest.add(pet1);
		String identifiedPet = underTest.findDescription(pet1.getDescription());
		assertThat(pet1.getDescription(), is(pet1.description));
		
	}

}
