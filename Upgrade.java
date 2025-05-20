
//-------------------------------------------------------------------------
/**
 *  Upgrade class for unit. Determines what upgrades
 *  a unit has
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class Upgrade
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param name takes in name
     * @param points takes in points
     */
    public Upgrade(String name, int points)
    {
        super();
        /*# Do any work to initialize your class here. */
        this.name = name;
        this.points = points;
    }


    //~ Methods ...............................................................
    /**
     * returns the name of the upgrade
     * @return returns name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the points of the upgrade
     * @return returns int
     */
    public int getPoints()
    {
        return points;    
    }
    
    /**
     * Returns the upgrade name and points in a string
     * @return returns string
     */
    public String toString()
    {
        return name + " (" + points + ")";
    }

}
