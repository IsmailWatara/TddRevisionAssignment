package za.ac.cput.tdd;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LearnerToolTest {
    private LearnerTool tool1;
    private LearnerTool tool2;
    private LearnerTool tool3;
    private LearnerTool tool4;

    public LearnerToolTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        tool1 = new LearnerTool();
        tool2 = tool4;
        tool3 = new LearnerTool();
    }

    @AfterEach
    public void tearDown() {
    }
    @Test
    void testEquality()
    {
        assertEquals(true,tool1.Valid("Blackboard"));
    }
    @Test
    void testIdentity()
    {

        assertSame(tool2,tool4);
    }

    @Test
    void testFailing()
    {
        fail("Failing Test");
        assertSame(true,tool3.Valid(""));

    }

    @Test
    void TimeoutExceed ()
    {
        assertTimeout(Duration.ofMillis(17), () -> Thread.sleep(10));

    }

    @Test
    @Disabled
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}