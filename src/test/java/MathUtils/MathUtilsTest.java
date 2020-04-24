package MathUtils;

import org.junit.jupiter.api.*;
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
        /*
        * @Disable is used to disable a method from execution
        * */
    @Test
    @DisplayName("tesing add method utility")

     void testAdd(){
        /*
        * assumption is used when we are assuming something must be true to run this test case
        * if assumptions is false this test is disabled
        * */

        /*
        * assertAll() can be used for multiple assertions to run at once
        * */

        assertAll(
                () ->assertEquals(5, mathUtils.add(1, 4)),
                () ->assertNotEquals(5, mathUtils.add(1, 3))
        );
        /*assumeTrue(true);
        assertEquals(5, mathUtils.add(1, 4));
        assertNotEquals(5, mathUtils.add(1, 3));*/
    }

    @Test
    @Disabled
    @DisplayName("Testing division utility ")
    void testDivide(){

        assertEquals(2, mathUtils.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide a by b");

    }
    /*
    * @Nested annotation is used to group multiple but similar test cases
    * for E.g. both the below methods testPositiveAddition() & testNegativeAddition()
    * can be grouped using Nested class
    * */
    @Nested
    class TestAddition{
        @Test
        void testPositiveAddition(){
            assertEquals(5, mathUtils.add(1, 4));
        }

        @Test
        void testNegativeAddition(){
            assertEquals(-5, mathUtils.add(-1, -4));
        }
    }
/*    @Test
    void testPositiveAddition(){
        assertEquals(5, mathUtils.add(1, 4));
    }

    @Test
    void testNegativeAddition(){
        assertEquals(-5, mathUtils.add(-1, -4));
    }*/


}