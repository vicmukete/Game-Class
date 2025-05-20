
//-------------------------------------------------------------------------
/**
 *  A type of character class
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class Monster
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param name takes name value
     * @param points takes points value
     */
    public Monster(String name, int points)
    {
        super(name, points);
        /*# Do any work to initialize your class here. */
        setQuality(4);
        setDefense(4);
    }


    //~ Methods ...............................................................


}
