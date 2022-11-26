public class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString()
    {
        return name + " " + age;
    }
}