import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by: Anton Rolin
 * Date: 20/05/2021
 * Time: 09:40
 * Project: springdocker
 * Copyright: MIT
 */
class MyMathCalcTest {
    MyMathCalc mathCalc;

    @BeforeEach
    void init(){
        mathCalc = new MyMathCalc();
    }


    @Test
    void add() {
        int a = 5;
        int b = 10;

        int x = mathCalc.add(a, b);
        assertEquals(15, x);
    }

    @Test
    void multiply() {
        int a = 4;
        int b = 4;

        int x = mathCalc.multiply(a, b);
        assertEquals(16, x);
    }

    @Test
    void divide() {
        int a = 6;
        int b = 3;

        double x = mathCalc.divide(a, b);
        assertEquals(2, x);
    }

    @Test
    void divideByZero() {
        int a = 8;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
                mathCalc.divide(a, b);
        });
    }
}