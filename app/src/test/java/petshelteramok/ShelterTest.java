package petshelteramok;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ShelterTest {
    @Test void shouldAddPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertNotNull(underTest);
    }
}