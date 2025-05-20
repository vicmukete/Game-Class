import student.micro.*;
import static org.assertj.core.api.Assertions.*;


// -------------------------------------------------------------------------
/**
 *  Tests the unit class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private Unit ben10;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
        ben10 = new Unit("Ben Tenison", 10);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    
    /*
     * Getter Methods
     */
    /**
     * Tests the getName class
     */
    public void testGetName()
    {
        ben10.getName();
        assertThat(ben10.getName().equals("Ben Tenison"))
            .isTrue();
    }
    
    /**
     * Tests the getPoints method
     */
    public void testGetPoints()
    {
        ben10.setPoints(10);
        assertThat(ben10.getPoints()).isEqualTo(10);
        
        Upgrade infinityStones = 
            new Upgrade("The Infinity Stones", 10);
            
        ben10.addUpgrade(infinityStones);
        
        assertThat(ben10.getPoints()).isEqualTo(20);
    }
    
    /**
     * Tests the getDefense method
     */
    public void testGetDefense()
    {
        ben10.setDefense(5);
        assertThat(ben10.getDefense()).isEqualTo(5);
    }
    
    /**
     * Tests the getUpgrade method
     */
    public void testGetUpgrades()
    {
        ben10.getUpgrades();
        assertThat(ben10.getUpgrades()).isEmpty();
    }
    
    /*
     * Setters
     */
    /**
     * Tests the setPoints method
     */
    public void testSetPoints()
    {
        ben10.setPoints(5);
        assertThat(ben10.getPoints()).isEqualTo(5);
    }
    
    /**
     * Tests the setName method
     */
    public void testSetName()
    {
        ben10.setName("Moritz Zimmerman");
        assertThat(ben10.getName())
            .isEqualTo("Moritz Zimmerman");
        
    }
    
    /**
     * Tests the setQuality method
     */
    public void testSetQuality()
    {
        ben10.setQuality(5);
        assertThat(ben10.getQuality()).isEqualTo(5);
    }
    
    /**
     * Tests the setDefense method
     */
    public void testSetDefense()
    {
        ben10.setDefense(5);
        assertThat(ben10.getDefense()).isEqualTo(5);
    }
    
    /**
     * Tests the addUpgrade method
     */
    public void testAddUpgrade()
    {
        Upgrade oneRing = new Upgrade("The One Ring", 15);
        
        ben10.addUpgrade(oneRing);
        assertThat(ben10.getUpgrades()).contains(oneRing);
        
    }
    
    /**
     * Tests the removeUpgrade method
     */
    public void testRemoveUpgrade()
    {
        Upgrade oneRing = new Upgrade("The One Ring", 15);
        
        ben10.removeUpgrade(oneRing);
        assertThat(ben10.getUpgrades())
            .doesNotContain(oneRing);
    }
    
    /**
     * Tests the toString w no Upgrade
     */
    public void testsToStringNoUpgrades()
    {
        ben10.setQuality(3);
        ben10.setDefense(3);
        ben10.setPoints(10);
        
        String goal = "Ben Tenison (10, 3, 3)";
        assertThat(ben10.toString()).isEqualTo(goal);
    }
    
    /**
     * Tests the toString w Upgrade
     */
    
    public void testToStringUpgrades()
    {
        Upgrade infinityStones = 
            new Upgrade("The Infinity Stones", 15);                
        String goal = "Ben Tenison (25, 2, 2) upgrades:" +
            "[The Infinity Stones (15)]";
            
        ben10.addUpgrade(infinityStones);  
        assertThat(ben10.toString()).isEqualTo(goal);
    }
    
    /**
     * 
     * Need more ToString testMethods
     */
    

}
