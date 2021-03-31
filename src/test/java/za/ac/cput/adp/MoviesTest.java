package za.ac.cput.adp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {

    //Not local because im lazy
    private Movies movie1;
    private Movies movie2;
    private Movies movie3;

    @BeforeEach
    void setUp() {
        movie1 = new Movies();
        movie2 = new Movies();
        movie3 = movie1;
    }

    //Object Identity
    @Test
    void testMovieId() {
        assertSame(movie1, movie3);
    }

    //Object Equality
    @Test
    void testMovieEquality() {
        assertEquals(movie1, movie3);
    }

    //Failing Test


   @Timeouts(1000)
    @Test
    void testMovieTimeouts() {
        assertEquals(movie1, movie3);
    }

    @Disable
    @Test
    void disablingTest() {
        assertNotEquals(movie1.getType(), movie2.getType());
        System.out.println("Keenan disabled this");
    }
}