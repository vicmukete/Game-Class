import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the hero class, but it has not methods?
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.02)
 */
public class HeroTest
    extends TestCase
{
    //~ Fields ................................................................
    private Hero vic;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HeroTest test object.
     */
    public HeroTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
        vic = new Hero("Victor", 10);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the hero contsructor
     */
    public void testHero()
    {
        assertThat(vic.getDefense()).isEqualTo(5);
    }
}
