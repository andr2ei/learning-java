package ru.andronov.tutorials.level2.module3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human p1 = new Human("first name 1", "last name 1", 1);
    Human p2 = new Human("first name 1", "last name 1", 2);
    Human p3 = new Human("first name 1", "last name 3", 1);
    Human p4 = new Human("first name 4", "last name 1", 1);
    Human p5 = new Human("first name 1", "last name 1", 1);

    @Test
    void compareTo() {

        assertAll("Compare To",
                () -> assertTrue(p1.compareTo(p2) < 0),
                () -> assertTrue(p1.compareTo(p3) < 0),
                () -> assertTrue(p1.compareTo(p4) < 0),
                () -> assertEquals(0, p1.compareTo(p5)));
    }

    @Test
    void sortAndClone() throws CloneNotSupportedException {
        Human[] humans = new Human[]{p1, p2, p3, p4, p5};
        Arrays.sort(humans);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(humans));
        Human[] expected = new Human[]{p1, p5, p2, p4, p3};
        assertArrayEquals(expected, humans);

        Human p1Clone = (Human)p1.clone();
        assertEquals(p1, p1Clone);
        assertNotSame(p1Clone, p1);
    }
}