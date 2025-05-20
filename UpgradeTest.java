import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the upgrade class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.02)
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................
    private Upgrade infinityStones;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
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
        infinityStones = new Upgrade("The Infinity Stones", 15);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the toString method
     */
    public void testToString()
    {
        infinityStones.toString();
        String goal = "The Infinity Stones (15)";
        
        assertThat(infinityStones.toString()).isEqualTo(goal);
    }
    
    /**
     * tests the getPoints method
     */
    public void testGetPoints()
    {
        infinityStones.getPoints();
        assertThat(infinityStones.getPoints()).isEqualTo(15);
    }
    
    /**
     * 
     * tests the getName method
     */
    public void testGetName()
    {
        String correctName = "The Infinity Stones";
        
        infinityStones.getName();
        assertThat(infinityStones.getName()).isEqualTo(correctName);
    }

}
