package za.ac.cput.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    //Application declaration for Object Identity and Equality Testing
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    void setUp() {
        student1 = new Student();
        student2 = new Student();
        student3 = student1;
    }

    //Application Declaration for Test-Fail calculations
    private Student calculate;
    public StudentTest() {
    }


    //Identity Testing
    @Test
    void testIdentity () {
        assertSame(student1, student1);
    }

    //Equality Testing
    @Test
    void testEquality () {
        assertEquals(student1,student3);
    }


    //Fail Test
    @Test
    void testFail() {
        assertEquals(student1,student3);
        //fail();
    }

    //Disabling Test

    @Test
    @Disabled
    void testDisabled() {
        System.out.println("THIS SHOULD BE DISABLED");
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void test_this() {
    }

}