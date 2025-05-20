
//-------------------------------------------------------------------------
/**
 *  Class that determines the enhancements of a unit
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class EnhancedUnit
    extends Unit
{
    //~ Fields ................................................................

    private String specialRule;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created EnhancedUnit object.
     * @param name takes name value
     * @param points takes point value
     */
    public EnhancedUnit(String name, int points)
    {
        super(name, points);
        /*# Do any work to initialize your class here. */
        this.specialRule = null;
    }


    //~ Methods ...............................................................
    /**
     * Returns a string with a special rule for the unit
     * @return gives back string combination
     */
    public String toString()
    {
        String result = super.toString();
        
        if (specialRule != null)
        {
            result += " special rule:[" + specialRule + "]";
        }
        return result;
    }
    
    /**
     * 
     * Sets the special rule (i used this for testing specifically)
     * @param specialRule takes the special rule value
     */
    public void setSpecialRule(String specialRule)
    {
        this.specialRule = specialRule;
    }

}
