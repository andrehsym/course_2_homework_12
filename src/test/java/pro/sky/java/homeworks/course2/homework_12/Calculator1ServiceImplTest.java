package pro.sky.java.homeworks.course2.homework_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.homeworks.course2.homework_12.controller1.Calculator1ServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1ServiceImplTest {

    Calculator1ServiceImpl out = new Calculator1ServiceImpl();

    @Test
    void plusInt() {

        int num1 = (-1);
        int num2 = (-100);
        Assertions.assertEquals(out.plusInt(num1, num2), -101);

        int num3 = 1;
        int num4 = 100;
        Assertions.assertEquals(out.plusInt(num3, num4), 101);
    }

    @Test
    void minusInt() {
        int num1 = (-1);
        int num2 = (-100);
        Assertions.assertEquals(out.minusInt(num1, num2), 99);

        int num3 = 1;
        int num4 = 100;
        Assertions.assertEquals(out.minusInt(num3, num4), -99);
    }

    @Test
    void multiplyInt() {
        int num1 = (-1);
        int num2 = (-100);
        Assertions.assertEquals(out.multiplyInt(num1, num2), 100);

        int num3 = 1;
        int num4 = 100;
        Assertions.assertEquals(out.multiplyInt(num3, num4), 100);
    }

    @Test
    void divideIntThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divideInt(12, 0));
    }

    @Test
    void divideInt() {
        int num1 = -1;
        int num2 = -100;
        Assertions.assertEquals(out.divideInt(num1, num2), 0.0);

        int num3 = 4224;
        int num4 = 302;
        Assertions.assertEquals(out.divideInt(num3, num4), 13.0);
    }

}