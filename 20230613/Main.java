public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        MyDate newYear = new MyDate(2023, 1, 1);
        MyDate valentines = new MyDate(2023, 2, 14);
        MyDate myBirthday = new MyDate(1990, 1, 1);
        MyDate xmas23 = new MyDate();

        //TEST PRINTS
        System.out.println(newYear.getYear() + " " + newYear.getMonth() + " " + newYear.getDay());
        System.out.println(valentines.getYear() + " " + valentines.getMonth() + " " + valentines.getDay());
        System.out.println(myBirthday.getYear() + " " + myBirthday.getMonth() + " " + myBirthday.getDay());

        //COMPARE
        System.out.println(newYear.isBefore(valentines));
        System.out.println(valentines.isBefore(newYear));
        System.out.println(myBirthday.isBefore(newYear));
        System.out.println(newYear.isBefore(myBirthday));

        //TEST PRINTS FOR setMonth
        System.out.println(xmas23.getMonth());
        xmas23.setMonth("jUne");
        System.out.println(xmas23.getMonth());





    }
}