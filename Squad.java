import java.util.ArrayList;
import java.util.List;

//-------------------------------------------------------------------------
/**
 *  Holds a group of units
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class Squad
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param name takes name value
     */
    public Squad(String name)
    {
        super(name, 0);
        /*# Do any work to initialize your class here. */
        this.units = new ArrayList<>();
    }


    //~ Methods ...............................................................
    /**
     * Returns the list of characters in a unit
     * @return returns list
     */
    public List<Unit> getUnits()
    {
        return units;
    }
    
    /**
     * Adds a new character into the squad
     * @param unit takes in a unit char
     */
    public void addUnit(Unit unit)
    {
        units.add(unit);
    }
    
    /**
     * Removes a unit/char from the squad
     * @param unit takes in a unit char
     */
    public void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
    
    /**
     * returns the total number of points of the squad
     * @return returns int
     */
    public int getPoints()
    {
        int totalPoints = super.getPoints();
        
        for (Unit unit : units)
        {
            totalPoints += unit.getPoints();
        }
        
        return totalPoints;
    }
    
    /**
     * Returns the squad units and their stats
     * @return returns string
     */
    public String toString()
    {
        return super.toString() + " units:" + units.toString();
    }
}
