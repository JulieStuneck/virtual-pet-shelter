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
		pet1 = new VirtualPet("Elvis","wiggley boy", 10,1,1,1,1);
		pet2 = new VirtualPet("Spot", "classic form", 1,1,1,1,1);
		
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
		
	}@Test
	public void shouldBeAbleToRemoveAPetForAdoption() {
		underTest.add(pet1);
		underTest.remove(pet1);
		VirtualPet identifiedPet = underTest.findPet(pet1.getVirtualPet());
		assertThat(identifiedPet, is(nullValue()));
	}
	
	@Test
	public void ShouldBeAbleToDecreaseHunger() {
		underTest.add(pet1);
		underTest.reduceHunger(pet1.getVirtualPet(), 2);
		assertThat(pet1.getHunger(), is (8));
		
	}
	

}
