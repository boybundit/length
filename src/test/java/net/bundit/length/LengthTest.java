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
    @Test
    void given_length_2_when_compare_to_length_2_then_it_should_be_equal() {
        Length two = new Length(2);
        Length anotherTwo = new Length(2);
        assertEquals(two, anotherTwo);
    }
    @Test
    void given_length_1_when_compare_to_length_2_then_it_should_not_be_equal() {
        Length one = new Length(1);
        Length two = new Length(2);
        assertNotEquals(one, two, "Length(1) should not equal to Length(2)");
    }
}
