import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

//Main Function
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //Prompt user to enter the following information
        System.out.print("Enter patient's ID: ");
        int p_id = scan.nextInt();
        System.out.print("Enter patient's first name: ");
        String p_firstname = scan.next();
        System.out.print("Enter patient's last name: ");
        String p_lastname = scan.next();
        System.out.print("Enter doctor's first name: ");
        String d_firstname = scan.next();
        System.out.print("Enter doctor's last name: ");
        String d_lastname = scan.next();
        System.out.print("Enter doctor's specialty: ");
        String specialty = scan.next();

        //Creating object for Doctor
        Doctor doctor = new Doctor(d_firstname, d_lastname, specialty);

        //Creating object for Patient
        Patient patient = new Patient(p_firstname, p_lastname, p_id, new Date(19, 12, 1995), doctor, new Date(15, 4, 2009), new Date(21, 4, 2009));

        //Creating object for Bill
        Bill bill = new Bill(patient.getPatientID(), 245.50, 2500, 3500.38);

        //Output for console application
        System.out.println(patient);
        System.out.println("\n" + bill);

        //Output for text file
        String filename = patient.getFirstName() + patient.getLastName() + ".txt";

        //try and catch block
        try {
            FileWriter fw = new FileWriter(new File(filename));
            fw.write(patient.toString() + "\n");
            fw.write("\n" + bill);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
