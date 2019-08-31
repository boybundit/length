package net.bundit.length;

public class Length {

    private int length;

    public Length(int length) {
        this.length = length;
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
        return this.length == anotherLength.length;
    }

}
