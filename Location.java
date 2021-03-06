/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }
    // возвращаю hashCode
    public int hashCode ()
    {
        int hash = 11;
    	hash = 31 * hash + xCoord;
    	hash = 31 * hash + yCoord;
    	return hash;
    }
    // сравниваю значения 2 объектов класса Location
    public boolean equals(Object  a)
    {
        if (!(a instanceof Location))
                return false;
        return (((Location)a).xCoord == xCoord & ((Location)a).yCoord == yCoord);
    }
    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
}