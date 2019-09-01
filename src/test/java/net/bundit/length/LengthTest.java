package net.bundit.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void given_length_1cm_when_compare_to_length_1cm_then_it_should_be_equal() {
        Length one = new Length(1, LengthUnit.cm);
        Length anotherOne = new Length(1, LengthUnit.cm);
        assertEquals(one, anotherOne);
    }
    @Test
    void given_length_2cm_when_compare_to_length_2cm_then_it_should_be_equal() {
        Length two = new Length(2, LengthUnit.cm);
        Length anotherTwo = new Length(2, LengthUnit.cm);
        assertEquals(two, anotherTwo);
    }
    @Test
    void given_length_1cm_when_compare_to_length_2cm_then_it_should_not_be_equal() {
        Length one = new Length(1, LengthUnit.cm);
        Length two = new Length(2, LengthUnit.cm);
        assertNotEquals(one, two, "Length(1cm) should not equal to Length(2cm)");
    }
}
