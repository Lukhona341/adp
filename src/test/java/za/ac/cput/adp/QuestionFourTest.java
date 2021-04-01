package za.ac.cput.adp;

/** Wajedien Samuels - 216287820
 *
 * This is a verification program
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class QuestionFourTest {

    private QuestionFour Person1;
    private QuestionFour Person2;
    private QuestionFour Person3;
    private QuestionFour Person4;

    @BeforeEach
        void setUp() {
            Person1 = new QuestionFour();
            Person2 = new QuestionFour();
            Person3 = new QuestionFour();
            Person4 = Person3;
        }

        @Test
        @DisplayName("Shows Object Equality")
        void testEquality() {

            assertSame(Person1, Person1);
            System.out.println("Is equal");
        }

        @Test
        @DisplayName("Shows Object Identity")
        void testIdentity()  {
            assertEquals(Person3, Person4);
            System.out.println("Identical");
        }

        @Test
        @DisplayName("Shows a failed test")
        void failTest() {
            assertEquals(Person3, Person4);
            fail("this test failed");
        }

        @Test
        @DisplayName("Shows a test Time Out")
        void testTimeOut(){
            assertTimeout(Duration.ofMillis(100), () -> {
                Thread.sleep(2000);

                System.out.println("Test Timed out");
            });
        }

        @Test
        @Disabled("Shows a disabled test")
        void disableTest() {
            assertEquals(Person3, Person4);
        }
    }

