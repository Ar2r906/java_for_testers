package ru.stqa.geometry.figures;

public class Square {
    static void printSquareParametrs(double side) {
        String text = String.format("Площадь квадрата со стороной %f = %f", side, area(side));
        System.out.println(text);
    }

    public static double area(double a) {
        return a*a;
    }

    public static double perimetr(double v) {
        return 4 * v;
    }
}
