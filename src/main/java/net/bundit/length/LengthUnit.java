package net.bundit.length;

public class LengthUnit {
    public static final LengthUnit cm = new LengthUnit("cm");
    public static final LengthUnit m = new LengthUnit("m");

    private String unit;

    private LengthUnit(String unit) {
        this.unit = unit;
    }
}
