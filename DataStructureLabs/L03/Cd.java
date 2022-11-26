

public abstract class Cd
{
    // protected variables
    protected String performers;
    protected String label; 
    protected int selections; 
    protected double playtime; 
    

    Cd() // default constructor
    {
        this.performers = "unknown";
        this.label = "unknown";
        this.selections = 0;
        this.playtime = 0.0;
    }

    Cd(String  performers,  String label,  int  selections,  double  playtime) // parametrized constrctor
    {
        this.performers = performers;
        this.label = label;
        this.selections = selections;
        this.playtime = playtime;
    }

    abstract void Report(); // abstract report function
}