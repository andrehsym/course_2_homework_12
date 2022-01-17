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
        out.plusInt(num1, num2);

        int num3 = 1;
        int num4 = 100;
        out.plusInt(num3, num4);
    }

    @Test
    void minusInt() {
        int num1 = (-1);
        int num2 = (-100);
        out.minusInt(num1, num2);

        int num3 = 1;
        int num4 = 100;
        out.minusInt(num3, num4);
    }

    @Test
    void multiplyInt() {
        int num1 = (-1);
        int num2 = (-100);
        out.multiplyInt(num1, num2);

        int num3 = 1;
        int num4 = 100;
        out.multiplyInt(num3, num4);
    }

    @Test
    void divideInt() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divideInt(12, 0));

        int num1 = -1;
        int num2 = -111;
        out.divideInt(num1, num2);

        int num3 = 422432234;
        int num4 = 302;
        out.divideInt(num3, num4);
    }
}