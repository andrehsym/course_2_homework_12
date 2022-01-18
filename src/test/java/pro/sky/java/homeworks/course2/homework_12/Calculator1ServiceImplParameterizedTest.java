package pro.sky.java.homeworks.course2.homework_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.homeworks.course2.homework_12.controller1.Calculator1ServiceImpl;

import java.util.stream.Stream;


public class Calculator1ServiceImplParameterizedTest {

    Calculator1ServiceImpl out = new Calculator1ServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    void plusIntParamTest(int numParam1, int numParam2, int result) {
        Assertions.assertEquals(out.plusInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.plusInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.plusInt(numParam1, numParam2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    void minusIntParamTest(int numParam1, int numParam2, int result) {
        Assertions.assertEquals(out.minusInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.minusInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.minusInt(numParam1, numParam2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    void multiplyIntParamTest(int numParam1, int numParam2, int result) {
        Assertions.assertEquals(out.multiplyInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.multiplyInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.multiplyInt(numParam1, numParam2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    void divideIntParamTest(int numParam1, int numParam2, int result) {
        Assertions.assertEquals(out.divideInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.divideInt(numParam1, numParam2), result);
        Assertions.assertEquals(out.divideInt(numParam1, numParam2), result);
    }

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(-1, -100, -101),
                Arguments.of(1, 100, 101),
                Arguments.of(2, 22, 24)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(-1, -100, 99),
                Arguments.of(1, 100, -99),
                Arguments.of(22, 22, 0)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(-1, -100, 100),
                Arguments.of(1, 100, 100),
                Arguments.of(22, 2, 44)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(-100, -1, 100),
                Arguments.of(3, 3, 1),
                Arguments.of(200, 2, 100)
        );
    }
}
