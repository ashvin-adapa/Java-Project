
//class Doctor (extending to Person class)
public class Doctor extends Person {

    //Creating data members
    private String specialty;

    //Constructor
    Doctor(String firstname, String lastname, String specialty) {

        //Calling super class constructor
        super(firstname, lastname);
        this.specialty = specialty;
    }


    //setter
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //getter
    public String getSpecialty() {
        return specialty;
    }
    @Override
    public String toString() {

        return super.toString() + " " + specialty;
    }
}
