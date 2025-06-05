
import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testSumar_and_returnSameValue(){
        // Arrange
        int a = 4;
        int b = 5;
        int expected = 9;

        // Act
        int actual = calculadora.sumar(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testDividir_and_returnExactIntValue() throws IllegalAccessException {
        // Arrange
        int a = 10;
        int b = 2;
        int expected = 5;

        // Act
        int actual = calculadora.dividir(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testDividir_and_returnAroundIntValue() throws IllegalAccessException {
        // Arrange
        int a = 4;
        int b = 5;
        int expected = 0;

        // Act
        int actual = calculadora.dividir(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testDividirPorCero_and_returnZero() throws IllegalAccessException {
        // Arrange
        int a = 4;
        int b = 0;
        String expected = "No se puede dividir por cero";

        // Act
        ArithmeticException actual = assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(4, 0)
        );

        // Assert
        assertEquals(expected, actual.getMessage());
    }

}
