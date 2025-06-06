
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
    void testMultiplicar_and_returnSameValue(){
        // Arrange
        int a = 4;
        int b = 5;
        int expected = 20;

        // Act
        int actual = calculadora.multiplicar(a, b);

        // Assert
        assertEquals(expected, actual);
    }

}
