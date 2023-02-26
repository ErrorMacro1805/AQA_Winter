package CalcTest;

import Lesson20_homework.Calculator;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private static Calculator calc;

    @BeforeAll
      public static void init() {
         calc = new Calculator();
        System.out.println("Initiation");
    }

    @BeforeEach
    public void log(){
        System.out.println("Test Start");
    }

    @Test
    @DisplayName("Test add 5 + 5")
    public void testAdd() {
        int expected =10;
        int actual =calc.add(5,5);
        Assertions.assertEquals(expected, actual, "Wrong actual result of add");
    }

    @Test
    @DisplayName("Test subtract 10 - 5")
    public void testSubtract() {
        int expected =5;
        int actual =calc.subtract(10,5);
        Assertions.assertEquals(expected, actual, "Wrong actual result of subtract");
    }

    @Test
    @DisplayName("Test multiply 4 * 5")
    public void testMultiply() {
        int expected =20;
        int actual =calc.multiply(4,5);
        Assertions.assertEquals(expected, actual,"Wrong actual result of multiply");
    }

    @Test
    @DisplayName("Test divide 4 * 5")
    public void testDivide() {
        int expected =4;
        int actual =calc.divide(16,4);
        Assertions.assertEquals(expected, actual, "Wrong actual result of divide");
    }

    @ParameterizedTest
    @DisplayName("Test multiply with parameters")
    @MethodSource("integerStreamProvider")

    public void testMultiplyWithParameter(int a, int b, int result) {
        System.out.println("a="+ a + " b="+ b + " result="+result );
        int actual = calc.multiply(a,b);
        Assertions.assertEquals(result, actual);
    }

    private static  Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(10, 10, 100),
                Arguments.of(6, 8, 48)
        );

    }



    @AfterEach
    public void afterTestLog(){
        System.out.println("Test is finished");
    }

    @AfterAll
    public static void afterExecutionLog(){
        System.out.println("Execution is done");
    }
}
