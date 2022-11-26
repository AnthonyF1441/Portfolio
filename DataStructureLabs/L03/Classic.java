public class Classic extends Cd
{
    private String primaryWork;

    Classic()
    {
        this.primaryWork = "Unknown";
    }

    Classic(String primaryWork, String performers, String label, int selections, double playtime) //parametrized constructor 
    {
        super(performers, label, selections, playtime); // pulls from the parent file
        if (primaryWork == null) // checks if primary work has a value or is null
        {
            this.primaryWork = "Unknown";
        }
        else // if there is a value then make it the new value for the primary work variable
        {
            this.primaryWork = primaryWork;
        }
    }

    void Report()
    {  // print function
        System.out.println("Performers: " + this.performers + "\nLabel: " + this.label + "\nSelection: " + this.selections + "\nPlaytime: " + this.playtime + "\nPrimary Work: " + this.primaryWork);
    }
}
