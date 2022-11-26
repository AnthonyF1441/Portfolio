public class People {
    // variables
    String name;
    int age;
    String status;


    People(String name, int age, String status) //parametrized constructor
    {
        this.name = name;
        this.age = age;
        this.status = status;
    }
    public String getStatus() { // getter
        return status;
    }
    public String toString() { //tostring function for later
        return this.name +": "+ this.age +": "+ this.status;
    }
}
