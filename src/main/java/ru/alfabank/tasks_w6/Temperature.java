package ru.alfabank.tasks_w6;

public final class Temperature {
    public static final double KELVIN_OFFSET = 273.15;
    public static final double FAHRENHEIT_ADD_OFFSET = 32;
    public static final double FAHRENHEIT_MULT_OFFSET = 1.8;

    public static double cToF(double celsius) {
        return celsius * FAHRENHEIT_MULT_OFFSET + FAHRENHEIT_ADD_OFFSET;
    }

    public static double fToC(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_ADD_OFFSET) / FAHRENHEIT_MULT_OFFSET;
    }

    public static double cToK(double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static double kToC(double kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    private Temperature() {
    }
}
