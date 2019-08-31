package net.bundit.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void given_length_1_when_compare_to_length_1_then_it_should_be_equal() {
        Length one = new Length(1);
        Length anotherOne = new Length(1);
        assertEquals(one, anotherOne);
    }
}
