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
        //int nMonth;

        switch (sMonth) {
            case "january":
                //nMonth = 1;
                //return nMonth;
                this.month = 1;
                break;
            case "february":
                //nMonth = 2;    
                //return nMonth;
                this.month = 2;
                break;
            case "march":
                //nMonth = 3;
                //return nMonth;
                this.month = 3;
                break;
            case "april":
                //nMonth = 4;
                //return nMonth;
                this.month = 4;
                break;
            case "may":
                //nMonth = 5;
                //return nMonth;
                this.month = 5;
                break;
            case "june":
                //nMonth = 6;
                //return nMonth;
                this.month = 6;
                break;
            case "july":
                //nMonth = 7;
                //return nMonth;
                this.month = 7;
                break;
            case "august":
                //nMonth = 8;
                //return nMonth;
                this.month = 8;
                break;
            case "september":
                //nMonth = 9;
                //return nMonth;
                this.month = 9;
                break;
            case "october":
                //nMonth = 10;
                //return nMonth;
                this.month = 10;
                break;
            case "november":
                //nMonth = 11;
                //return nMonth;
                this.month = 11;
                break;
            case "december":
                //nMonth = 12;
                //return nMonth;
                this.month = 12;
                break;
            default: 
                //return 0;
                this.month = 13;
                break;
        }
    }

    public boolean isBefore(MyDate date) {
        //code
        // Check YEAR first, if same, move to month, if same, move to day
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
