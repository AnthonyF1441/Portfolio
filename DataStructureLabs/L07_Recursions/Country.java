public class Country {
    //variables
    private String name;
    private double population;
    Country()
    {
        this.name = "";
        this.population = 0.0;
    }

    Country(String name, double population) // paramterized constructor
    {
        this.name = name;
        this.population = population;
    }

    public String toString()
    {
        return this.name + ": " + String.format("%,d", (long) this.population);
    }
}
