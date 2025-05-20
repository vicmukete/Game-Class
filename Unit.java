import java.util.ArrayList;
import java.util.List;
//-------------------------------------------------------------------------
/**
 *  Designs a single unit and their specified stats
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public class Unit
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;
    private int quality;
    private int defense;
    private List<Upgrade> upgrades;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Unit object.
     * @param name takes name value
     * @param points takes point value
     */
    public Unit(String name, int points)
    {
        super();
        /*# Do any work to initialize your class here. */
        this.points = points;
        this.quality = 2;
        this.defense = 2;
        this.name = name;
        this.upgrades = new ArrayList<>();
    }


    //~ Methods ...............................................................
    /*
     * Getter Methods 
     */
    /**
     * Returns the name of the unit
     * @return will return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the points of the unit
     * @return will return points
     */
    public int getPoints()
    {
        int totalPoints = points;
        for (Upgrade upgrade : upgrades)
        {
            totalPoints += upgrade.getPoints();
        }
        
        return totalPoints;
    }
    
    /**
     * Returns the quality points of the unit
     * @return will return quality
     */
    public int getQuality()
    {
        return quality;
    }
    
    /**
     * Returns the defense points of the unit
     * @return will return the defense
     */
    public int getDefense()
    {
        return defense;
    }
    
    /**
     * Returns the list of upgrades for the unit
     * @return will return the list
     */
    public List<Upgrade> getUpgrades()
    {
        return upgrades;
    }
    
    /*
     * Setters
     */
    
    /**
     * Sets the points for the unit
     * @param points takes points
     */
    public void setPoints(int points)
    {
        this.points = points;
    }
    
    /**
     * Sets the name for the unit
     * @param name takes name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the quality for the unit
     * @param quality takes quality
     */
    public void setQuality(int quality)
    {
        this.quality = quality;
    }
    
    /**
     * Sets the defense for the unit
     * @param defense takes defense
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    
    /*
     * Other Methods
     */
    /**
     * Adds an upgrade to the unit
     * @param upgrade takes upgrade
     */
    public void addUpgrade(Upgrade upgrade)
    {
        upgrades.add(upgrade);
    }
    
    /**
     * removes an upgrade from the unit
     * @param upgrade takes upgrade
     */
    public void removeUpgrade(Upgrade upgrade)
    {
        upgrades.remove(upgrade);
    }
    
    /*
     *@return String toString Override method
     */
    /**
     * Returns a string summarizing the unit depending
     * on their name, points, and upgrade
     * @return returns string combination
     */
    public String toString()
    {
        if (upgrades.isEmpty())
        {
            return name + " (" + getPoints() + ", " + quality 
                + ", " + defense + ")";
        }
        else
        {
            return name + " (" + getPoints() + ", " + quality
                + ", " + defense + ")" + " upgrades:" 
                + upgrades.toString();
        }
    }
}
