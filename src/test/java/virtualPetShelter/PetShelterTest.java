package virtualPetShelter;
import static org.hamcrest.Matchers.containsInAnyOrder; 
import static org.hamcrest.Matchers.is; 
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	
	VirtualPetShelter underTest;
	VirtualPet pet1;
	
	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("Elvis","silly boy", 1,1,1,1,1);
		
	}
	
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		VirtualPet identifiedPet = underTest.findPet("name");
		assertThat(identifiedPet, is(pet1));
	}
	

}
