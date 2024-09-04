package ru.stqa.geometry.figures;

public class Rectangle {
    static void printRectangleParametrs(double sideA, double sideB) {
        String text = String.format("Площадь прямоуггольника со сторонами: %f = %f, %f = %f", sideA, sideB, area(sideA, sideB));
        System.out.println(text);
    }

    public static double area(double a, double b) {
        return a*b;
    }

    public static double perimetr(double a, double b) {
        return (a+b) * 2;
    }
}
