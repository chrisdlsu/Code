public class MyDate {
    //ATTRIBUTES
    private int year;
    private int month;
    private int day;

    //CONSTRUCTORS
    public MyDate(int year, int month, int day) { // all attr
        
    }
    public MyDate(int month, int day) { // year init to 2022
        this.year = 2022;
    }
    public MyDate() { // no attr, default 1990 1 1
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

    public int setMonth(String month) { //additional method for String month
        month = month.toLowerCase(); // convert string to lowercase
        switch (month) {
            case "january":
                return 1;
                break;
            case "february":
                return 2;
                break;
            case "march":
                return 3;
                break;
            case "april":
                return 4;
                break;
            case "may":
                return 5;
                break;
            case "june":
                return 6;
                break;
            case "july":
                return 7;
                break;
            case "august":
                return 8;
                break;
            case "september":
                return 9;
                break;
            case "october":
                return 10;
                break;
            case "november":
                return 11;
                break;
            case "december":
                return 12;
                break;
            default: 
                System.out.println("month cannot be matched");
                break;
        }
    }

    //OTHER METHODS
    public boolean isBefore(int year, int month, int day) {
        
        if (year != this.year) {
            //proceed to compare two different years
            if (year > this.year) {
                return true;
            } else return false;
        } else if ()
        
        
        //test
        if (year > this.year) {
            return true;
        } else return false;


        // do an if statement to:
        //compare YEAR
        // compare MONTH
        // compare DAY

        //return boolean;
    }

}
