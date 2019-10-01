package nl.han.ica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    Character sut;
    @BeforeEach
    void setUp() {
        sut = new Character("Jeroen", 1000, new Tile(1));
    }

    @Test
    void characterWithNameAndEnergieShouldReturnNameAndEnergie() {
        assertEquals("Jeroen", sut.getName());
        assertEquals(1000, sut.getEnergy());
    }


}