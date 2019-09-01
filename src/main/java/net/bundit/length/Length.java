package net.bundit.length;

import net.bundit.length.LengthUnit;

public class Length {

    private double length;
    private LengthUnit lengthUnit;

    public Length(double length, LengthUnit lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public Length toBaseUnit() {
        return new Length(this.lengthUnit.toBaseUnitValue(this.length), this.lengthUnit.baseUnit);
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
        Length anotherLengthInBaseUnit = anotherLength.toBaseUnit();
        Length thisInBaseUnit = this.toBaseUnit();
        return (thisInBaseUnit.length == anotherLengthInBaseUnit.length);
    }

    @Override
    public String toString() {
        return "Length(" + this.length + this.lengthUnit + ")";

    }
}
