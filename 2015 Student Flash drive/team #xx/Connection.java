
/**
 * Write a description of class Connection here.
 * 
 * @author Don Allen
 * @version 2015 Wittry contest
 */
public class Connection
{
    private String source;
    private String destination;

    /**
     * Constructor for objects of class Connection
     */
    public Connection(String s, String d)
    {
       source = s;
       destination = d;
    }

    public String getSource() { return source;  }
    public String getDestination() { return destination;  }

    public void setSource(String s) { source = s;  }
    public void setDestination(String d) { destination = d;  }

    public boolean equals(Object obj)
    {
       Connection temp = (Connection)obj;
       return getSource().equals(temp.getSource()) && getDestination().equals(temp.getDestination());
    }

    public int hashCode()
    {
       return getSource().hashCode() + getDestination().hashCode();
    }
}