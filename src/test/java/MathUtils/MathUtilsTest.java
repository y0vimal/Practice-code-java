package MathUtils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    private MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd(){

        assertEquals(5, mathUtils.add(1, 4));
        assertNotEquals(5, mathUtils.add(1, 3));
    }

    @Test
    void testDivide(){
        assertEquals(2, mathUtils.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide a by b");

    }

}