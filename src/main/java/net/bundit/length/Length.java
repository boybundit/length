package net.bundit.length;

public class Length {

    private int length;
    private String lengthUnit;

    public Length(int length, String lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public Length toBaseUnit() {
        return this;
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
