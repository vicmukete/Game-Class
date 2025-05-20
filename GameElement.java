
//-------------------------------------------------------------------------
/**
 *  Interface each class implements from
 *
 *  @author Victor Mukete (906540931)
 *  @version (2025.04.01)
 */
public interface GameElement
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     
        int sampleMethod(int y);
    */
    
    /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName();
    
    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints();
}

