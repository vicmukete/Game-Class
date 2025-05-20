import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the monster class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.02)
 */
public class MonsterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Monster iz;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MonsterTest test object.
     */
    public MonsterTest()
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
        iz = new Monster("Izabella", 10);
    } 


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the monster constructor
     */
    
    public void testMonster()
    {
        assertThat(iz.getDefense()).isEqualTo(4);
    }
}
