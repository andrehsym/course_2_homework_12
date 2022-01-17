package pro.sky.java.homeworks.course2.homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.homeworks.course2.homework_12.controller1.Calculator1ServiceImpl;

import java.util.stream.Stream;


public class Calculator1ServiceImplParameterizedTest {

    Calculator1ServiceImpl out = new Calculator1ServiceImpl();

    private static final int NUMPARAM1 = (-1);
    private static final int NUMPARAM2 = (-100);
    private static final int NUMPARAM3 = 0;
    private static final int NUMPARAM4 = 0;

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void plusIntParamTest(int numParam1, int numParam2) {
        out.plusInt(numParam1, numParam2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void minusIntParamTest(int numParam1, int numParam2) {
        out.minusInt(numParam1, numParam2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void multiplyIntParamTest(int numParam1, int numParam2) {
        out.multiplyInt(numParam1, numParam2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void divideIntParamTest(int numParam1, int numParam2) {
        out.plusInt(numParam1, numParam2);
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(NUMPARAM1, NUMPARAM2),
                Arguments.of(NUMPARAM3, NUMPARAM4)
        );
    }
}
