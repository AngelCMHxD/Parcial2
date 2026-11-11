package me.angel.logica;

public class Parcial {

    public static String calcularRaices(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a no puede ser cero");
        }

        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            throw new IllegalArgumentException("las raices son complejas");
        }

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);

        return "x = " + r1 + ", x = " + r2;
    }
}
