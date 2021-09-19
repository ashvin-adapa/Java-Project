
//class Person
public class Person {

    //Creating data members
    private String First_Name;
    private String Last_Name;

    //Constructor
    Person(String firstname, String lastname) {
        this.First_Name = firstname;
        this.Last_Name = lastname;
    }
    //Creating setters
    public void setFirstName(String firstname) {
        this.First_Name = firstname;
    }

    public void setLastName(String lastname) {
        this.Last_Name = lastname;
    }

    //Creating getters
    public String getFirstName() {
        return First_Name;
    }

    public String getLastName() {
        return Last_Name;
    }

    public String toString() {
        return First_Name + " " + Last_Name;
    }
}
