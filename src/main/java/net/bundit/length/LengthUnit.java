package net.bundit.length;

public class LengthUnit {

    public static final LengthUnit m = new LengthUnit("m");
    public static final LengthUnit cm = new LengthUnit("cm", m, 100);

    public final String unit;
    public final LengthUnit baseUnit;
    public final double multiplier;

    private LengthUnit(String unit) {
        this.unit = unit;
        this.baseUnit = this;
        this.multiplier = 1;
    }

    private LengthUnit(String unit, LengthUnit baseUnit, double multiplier) {
        this.unit = unit;
        this.baseUnit = baseUnit;
        this.multiplier = multiplier;
    }

    public double toBaseUnitValue(double length) {
        return length / this.multiplier;
    }

}
