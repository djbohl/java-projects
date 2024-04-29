public class Client
{
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Client(String firstName, String lastName, int age, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String toString()
    {
        return firstName + " " + lastName + ", age " + age + "\n" + address;
    }
}