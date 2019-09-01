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
    @Test
    void given_length_1m_when_compare_to_length_1m_then_it_should_be_equal() {
        Length one = new Length(1, LengthUnit.m);
        Length anotherOne = new Length(1, LengthUnit.m);
        assertEquals(one, anotherOne);
    }
    @Test
    void given_length_1m_when_compare_to_length_2m_then_it_should_not_be_equal() {
        Length one = new Length(1, LengthUnit.m);
        Length two = new Length(2, LengthUnit.m);
        assertNotEquals(one, two, "Length(1m) should not equal to Length(2m)");
    }
    @Test
    void given_length_1cm_when_compare_to_length_2m_then_it_should_not_be_equal() {
        Length one_cm = new Length(1, LengthUnit.cm);
        Length one_m = new Length(1, LengthUnit.m);
        assertNotEquals(one_cm, one_m, "Length(1cm) should not equal to Length(1m)");
    }
}
