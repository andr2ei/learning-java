package ru.andronov.tutorials.level2.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing cat")
class CatTest {

    public static final String NAME_1 = "Name1";
    public static final int AGE = 10;
    public static final boolean IS_LAZY = true;

    @DisplayName("Testing all setters")
    @Test
    void setters() {
        Cat cat = new Cat();
        cat.setName(NAME_1);
        cat.setAge(AGE);
        cat.setLazy(IS_LAZY);

        assertAll("All setters",
                () -> assertEquals(NAME_1, cat.getName()),
                () -> assertEquals(AGE, cat.getAge()),
                () -> assertEquals(IS_LAZY, cat.isLazy()));
    }
}