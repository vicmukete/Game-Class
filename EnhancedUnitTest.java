import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the enhancedunit class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.02)
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private EnhancedUnit ben10000;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
        ben10000 = new EnhancedUnit("Ben 10000", 20);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    
    /**
     * Tests the toString method with no special rule
     */
    public void testToStringNoSpeciaRule()
    {
        String goal = "Ben 10000 (20, 2, 2)";
        
        assertThat(ben10000.toString()).isEqualTo(goal);
        
        //SpecialRule null Tests
        
        ben10000.setSpecialRule(null);
        assertThat(ben10000.toString()).isEqualTo(goal);
    }
    
    /**
     * Tests the toString method with a special rule
     */
    public void testToStringSpecialRule()
    {
        ben10000.setSpecialRule("Older");
        
        String goal = 
            "Ben 10000 (20, 2, 2) special rule:[Older]";
        
        assertThat(ben10000.toString()).isEqualTo(goal);
    }

}
