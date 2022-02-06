/**
 * League.java
 * TestClass
 * @author Ismail Watara(219018790)
 * 05 February 2022
 */







import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    private League name1;
    private League name2;
    private League name3;


    public LeagueTest() {
    }

    @BeforeEach
    public void setUp () {
        name1 = new League();
        name2 = new League();
        name3 = name1;
    }

    //Object Equality
    @Test
    public void testEquality () {
        assertEquals(name1, name1);

    }

    //Object identity

    @Test
    public void testIdentity () {
        assertSame(name1, name3);

    }

    //failing Test
    @Test
    public void failingTest () {
        fail("Test Failure");
        assertSame(name1, name3);
    }

    //TimeOuts
    @Test
    @Timeout(value = 100)
    public void testTimeout() {
        assertEquals(name1, name3);
    }

    //Disabling Test

    @Disabled("Disable Method")
    @Test
    public void TestDis() {
        //fail("This should Fail");
        assertSame(name1, name3);
    }

}


