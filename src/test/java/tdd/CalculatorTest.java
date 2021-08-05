package tdd;

import io.cucumber.java.PendingException;
import io.davlac.tddbddsample.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Stream<Arguments> substractProvideParameters() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(4, 3, 1),
                Arguments.of(9, 5, 4)
        );
    }

    // Parametrized tests
    @ParameterizedTest
    @MethodSource("substractProvideParameters")
    void substract_withTwoNumbers_shouldAddThem(Integer number1, Integer number2, Integer expectedResult) {
        assertEquals(expectedResult, Calculator.substract(number1, number2));
    }

    // Test not implemented yet
    @Test
    void multiply_withTwoNumbers_shouldMultiplyThem() {
        throw new PendingException();
    }

    // Method not implemented yet
    @Test
    void divide_withTwoNumbers_shouldDivideThem() {
        assertEquals(2, Calculator.divide(10, 2));
    }

}
