package net.bundit.length;

import net.bundit.length.LengthUnit;

public class Length {

    private int length;
    private String lengthUnit;

    public Length(int length, String lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public Length toBaseUnit() {
        int multiplier = 1;
        String baseUnit = LengthUnit.m;
        if (this.lengthUnit == LengthUnit.cm) {
            multiplier = 100;
        }
        return new Length(this.length / multiplier, baseUnit);
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject == this) {
            return true;
        }
        if (!(anotherObject instanceof Length)) {
            return false;
        }
        Length anotherLength = (Length)anotherObject;
        return (this.length == anotherLength.length) &&
                (this.lengthUnit == anotherLength.lengthUnit);
    }

}
