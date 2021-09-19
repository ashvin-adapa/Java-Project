
//Class Date
public class Date {

    //Creating data members
    private int day;
    private int month;
    private int year;

    //Constructor
    Date(int day, int month, int year) {

        //Checking for month
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            //Error statement for invalid month value
            throw new IllegalArgumentException("Value has to be between 1 and 12");
        }
        //Checking for day
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {

            //Error statement for invalid day value
            throw new IllegalArgumentException("Value has to be between 1 and 31");
        }
        this.year = year;
    }

    //Creating Setters
    public void setDay(int day) {
        // check for day
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {

            throw new IllegalArgumentException("Value has to be between 1 and 31");
        }
    }

    public void setMonth(int month) {

        //Checking for month
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Value has to be between 1 and 12");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return month + "-" + day + "-"+ year;
    }
}