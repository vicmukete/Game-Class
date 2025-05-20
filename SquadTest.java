import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  tests the squad method
 *  
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.02)
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................
    private Squad avengers;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
        avengers = new Squad("The Avengers");
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the getUnits method
     */

    public void testGetUnits()
    {
        assertThat(avengers.getUnits()).isEmpty();
    }
    
    /**
     * Tests the addUnit method
     */
    public void testAddUnit()
    {
        Unit ironman = new Unit("Iron Man", 10);
        Unit capAmerica = new Unit("Captain America", 10);
        Unit hulk = new Unit("The Hulk", 15);
        Unit thor = new Unit("Thor", 20);
        
        avengers.addUnit(ironman);
        avengers.addUnit(capAmerica);
        avengers.addUnit(hulk);
        avengers.addUnit(thor);
        
        assertThat(avengers.getUnits().size()).isEqualTo(4);       
    }
    
    /**
     * Tests the removeUnit method
     */
    public void testRemoveUnit()
    {
        Unit ironman = new Unit("Iron Man", 10);
        Unit capAmerica = new Unit("Captain America", 10);
        Unit hulk = new Unit("The Hulk", 15);
        Unit thor = new Unit("Thor", 20);
        
        avengers.addUnit(ironman);
        avengers.addUnit(capAmerica);
        avengers.addUnit(hulk);
        avengers.addUnit(thor);
        
        avengers.removeUnit(capAmerica);
        
        assertThat(avengers.getUnits().size()).isEqualTo(3);
    }
    
    /**
     * Tests the getPoints method
     */
    public void testGetPoints()
    {
        Unit ironman = new Unit("Iron Man", 10);
        Unit hulk = new Unit("The Hulk", 15);
        Unit thor = new Unit("Thor", 20);
        
        avengers.addUnit(ironman);
        avengers.addUnit(hulk);
        avengers.addUnit(thor);
        
        assertThat(avengers.getPoints()).isEqualTo(45);
    }
    
    /**
     * Tests the toString method in Squad class
     */
    public void testToString()
    {
        Unit ironman = new Unit("Iron Man", 10);
        Unit capAmerica = new Unit("Captain America", 10);
        
        avengers.addUnit(ironman);
        avengers.addUnit(capAmerica);
        
        String goal = 
            "The Avengers (20, 2, 2) units:" + 
            "[Iron Man (10, 2, 2), " + 
            "Captain America (10, 2, 2)]";
        
        assertThat(avengers.toString()).isEqualTo(goal);
    }
}
