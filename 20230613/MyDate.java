public class MyDate {
    //ATTRIBUTES
    private int year;
    private int month;
    private int day;

    //CONSTRUCTORS
    public MyDate(int year, int month, int day) { // all attr
        this.year = year;
        this.month = month;
        this.day = day;
        
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

    public void setMonth(String month) { //additional method for String month
       
        String sMonth = month.toLowerCase(); // convert string to lowercase
        int nMonth;

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

}
