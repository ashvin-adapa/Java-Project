public class Bill {

    //Creating data members
    private int Patient_ID;
    private double Pharmacy_Charges;
    private double Room_Charges;
    private double Doctor_Fees;

    //Constructor
    Bill(int patientID, double pharmacycharges, double roomcharges, double doctorfees) {
        this.Patient_ID = patientID;
        this.Pharmacy_Charges = pharmacycharges;
        this.Room_Charges = roomcharges;
        this.Doctor_Fees = doctorfees;
    }
    //Creating setters
    public void setPatientID(int patientID) {
        this.Patient_ID = patientID;
    }
    public void setPharmacyCharges(double pharmacyCharges) {
        this.Pharmacy_Charges = pharmacyCharges;
    }

    public void setDoctorFees(double doctorFees) {
        this.Doctor_Fees = doctorFees;
    }
    public void setRoomCharges(double roomCharges) {
        this.Room_Charges = roomCharges;
    }

    //Creating getters
    public int getPatientID() {
        return Patient_ID;
    }

    public double getPharmacyCharges() {
        return Pharmacy_Charges;
    }

    public double getRoomCharges() {
        return Room_Charges;
    }

    public double getDoctorFees() {
        return Doctor_Fees;
    }
    @Override
    public String toString() {

        //Display the following charges/fees
        String bill = "Pharmacy Charges: $" + Pharmacy_Charges +
                "\nRoom Charges: $" + Room_Charges +
                "\nDoctor Fees: $" + Doctor_Fees +
                "\n--------------------------------\n" + "Total Charges: " + (Pharmacy_Charges + Room_Charges + Doctor_Fees);
        return bill;
    }
}