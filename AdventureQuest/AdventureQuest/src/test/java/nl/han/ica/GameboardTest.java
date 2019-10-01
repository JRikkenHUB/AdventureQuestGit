package nl.han.ica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameboardTest {

    private Gameboard sut;

    @BeforeEach
    void setUp() {
        sut = new Gameboard();
    }

    @Test
    void generate64TilesTest(){
        sut.generate(64);

        int Actual = sut.getTileCount();

        assertEquals(64, Actual);
    }
}