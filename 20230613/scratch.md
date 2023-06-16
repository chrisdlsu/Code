public int setMonth(String month) { //additional method for String month
       
        String sMonth = month.toLowerCase(); // convert string to lowercase
        int nMonth;

        switch (sMonth) {
            case "january":
                nMonth = 1;
                return nMonth;
                break;
            case "february":
                nMonth = 2;    
                 return nMonth;
                break;
            case "march":
                nMonth = 3;
                return nMonth;
                break;
            case "april":
                nMonth = 4;
                return nMonth;
                break;
            case "may":
                nMonth = 5;
                return nMonth;
                break;
            case "june":
                nMonth = 6;
                return nMonth;
                break;
            case "july":
                nMonth = 7;
                return nMonth;
                break;
            case "august":
                nMonth = 8;
                return nMonth;
                break;
            case "september":
                nMonth = 9;
                return nMonth;
                break;
            case "october":
                nMonth = 10;
                return nMonth;
                break;
            case "november":
                nMonth = 11;
                return nMonth;
                break;
            case "december":
                nMonth = 12;
                return nMonth;
                break;
            default: 
                return 0;
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