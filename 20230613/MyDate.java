public class MyDate {
    //ATTRIBUTES
    private int year;
    private int month;
    private int day;

    //CONSTRUCTORS
    public MyDate(int year, int month, int day) { // all attributes
        this.year = year;
        this.month = month;
        this.day = day;
        
    }
    public MyDate(int month, int day) { // year value initializes to 2022
        this.year = 2022;
        this.month = month;
        this.day = day;
    }
    public MyDate() { // no attribution, default: 1990 1 1
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }
    //GETTERS
    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    //SETTERS
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) { //additional method for String month
       
        String sMonth = month.toLowerCase(); // convert string to lowercase

        switch (sMonth) {
            case "january":
                this.month = 1;
                break;
            case "february":
                this.month = 2;
                break;
            case "march":
                this.month = 3;
                break;
            case "april":
                this.month = 4;
                break;
            case "may":
                this.month = 5;
                break;
            case "june":
                this.month = 6;
                break;
            case "july":
                this.month = 7;
                break;
            case "august":
                this.month = 8;
                break;
            case "september":
                this.month = 9;
                break;
            case "october":
                this.month = 10;
                break;
            case "november":
                //nMonth = 11;
                //return nMonth;
                this.month = 11;
                break;
            case "december":
                this.month = 12;
                break;
            default: 
                this.month = 13; // testing value
                break;
        }
    }

    public boolean isBefore(MyDate date) { // Check YEAR first, if same, move to month, if same, move to day

        if (this.year < date.year) { // if year is prior
            return true; //year is before date compared
        } else if (this.year > date.year) { // if year is after
            return false;
        } else if (this.month < date.month)  { //same year, moving to month
            return true;
        } else if (this.month > date.month) { // month if after
            return false;
        } else if (this.day < date.day) { //same month, moving to day
            return true;
        } else if (this.day > date.day) { // day is after to compared
            return false;
        } else {
            return false;
        }   
    }
}
