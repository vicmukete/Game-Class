
//-------------------------------------------------------------------------
/**
 *  A type of character class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class Hero
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param name takes new name
     * @param points takes new points
     */
    public Hero(String name, int points)
    {
        super(name, points);       
        /*# Do any work to initialize your class here. */
        setQuality(5);
        setDefense(5);
    }


    //~ Methods ...............................................................


}
