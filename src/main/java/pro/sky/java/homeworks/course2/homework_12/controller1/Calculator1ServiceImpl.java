package pro.sky.java.homeworks.course2.homework_12.controller1;

import org.springframework.stereotype.Service;

@Service
public class Calculator1ServiceImpl implements Calculator1Service {

    public int plusInt(int num1, int num2) {
        return (num1+num2);
    }

    public int minusInt(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiplyInt(int num1, int num2) {
        return (num1 * num2);
    }

    public int divideInt(int num1, int num2) {
        return (num1 / num2);
    }
}
