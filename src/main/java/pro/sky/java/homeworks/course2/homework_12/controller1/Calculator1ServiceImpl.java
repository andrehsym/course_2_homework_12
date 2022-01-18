package pro.sky.java.homeworks.course2.homework_12.controller1;

import org.springframework.stereotype.Service;

@Service
public class Calculator1ServiceImpl implements Calculator1Service {

    @Override
    public int plusInt(int num1, int num2) {
        return (num1+num2);
    }

    @Override
    public int minusInt(int num1, int num2) {
        return (num1 - num2);
    }

    @Override
    public int multiplyInt(int num1, int num2) {
        return (num1 * num2);
    }

    @Override
    public int divideInt(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("divide by zero is not allowed");
        }
        return (num1 / num2);
    }
}
