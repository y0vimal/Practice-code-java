package MathUtils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;
    private static final Logger LOGGER = LoggerFactory.getLogger(MathUtilsTest.class);

    /*
    * Junit create separte instance of test class for each test - method
    * but @BeforeAll method shall be excuted prior to test call instantiation
    * Therefore this method should be static
    * same is for @AfterAll method
    * */
    @BeforeAll
    static void beforeAll(){
        LOGGER.info("before all ... ");
    }

    @AfterAll
    static void afterAll(){
        LOGGER.info("after all ... ");
    }

    @BeforeEach
    void beforeEachMethod(){
        mathUtils = new MathUtils();
    }

    void afterEachMethod(){
            LOGGER.info("after each method ... ");
    }

    @Test
     void testAdd(){

        assertEquals(5, mathUtils.add(1, 4));
        assertNotEquals(5, mathUtils.add(1, 3));
    }

    @Test
    void testDivide(){

        assertEquals(2, mathUtils.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide a by b");

    }

}