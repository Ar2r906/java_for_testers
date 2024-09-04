package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    void canCalculateArea() {
        Assertions.assertEquals(20.0, Rectangle.area(4.0, 5.0));
    }

    @Test
    void canCalculatePerimetr() {
        Assertions.assertEquals(18., Rectangle.perimetr(4.0, 5.));
    }
}
