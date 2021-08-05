package tdd;

import io.cucumber.java.PendingException;
import io.davlac.tddbddsample.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    // Parametrized tests with method provider parameters
    @ParameterizedTest
    @MethodSource("substractProvideParameters")
    void substract_withTwoNumbers_shouldSubstractThem(Integer number1, Integer number2, Integer expectedResult) {
        assertEquals(expectedResult, Calculator.substract(number1, number2));
    }

    // Parametrized tests with CSV source (can be a file)
    @ParameterizedTest
    @CsvSource({"2,1,3", "4,-1,3", "-10,10,0"})
    void add_withTwoNumbers_shouldAddThem(Integer number1, Integer number2, Integer expectedResult) {
        assertEquals(expectedResult, Calculator.add(number1, number2));
    }

    // Parametrized tests only one argument
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void add_withSameNumbers_shouldBehaveLikeMultiplication(Integer number) {
        assertEquals(number * 2, Calculator.add(number, number));
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
