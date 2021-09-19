
//class Patient (extending to Person class)
public class Patient extends Person {

    //Creating data members
        private int patientID;
        private Doctor physician;
        private Date attendDate;
        private Date dischargeDate;

    //Constructor
        Patient(String firstName, String lastName, int patientID, Date dob, Doctor physician, Date attendDate, Date dischargeDate) {

            //Calling super class constructor
            super(firstName, lastName);
            this.patientID = patientID;
            this.physician = physician;
            this.attendDate = attendDate;
            this.dischargeDate = dischargeDate;
        }
        //Creating setters
        public void setPatientID(int patientID) {
            this.patientID = patientID;
        }

        public void setPhysician(Doctor physician) {
            this.physician = physician;
        }

        public void setAttendDate(Date attendDate) {
            this.attendDate = attendDate;
        }

        public void setDischargeDate(Date dischargeDate) {
            this.dischargeDate = dischargeDate;
        }
        //Creating Getters
        public int getPatientID() {
            return patientID;
        }


        public Doctor getPhysician() {
            return physician;
        }

        public Date getAttendDate() {
            return attendDate;
        }

        public Date getDischargeDate() {
            return dischargeDate;
        }
        @Override
        public String toString() {

            //Display the following information
            String p = "Patient: " + super.toString() +
                    "\nAttending Physician: " + physician +
                    "\nAdmit Date: " + attendDate +
                    "\nDischarge Date: " + dischargeDate;
            return p;
        }
    }

