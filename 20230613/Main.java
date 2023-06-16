public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        MyDate testCal = new MyDate(1990, 12, 4);
        MyDate testCal2 = new MyDate(2, 2);
        MyDate testCal3 = new MyDate();

        System.out.println(testCal.getYear());
        System.out.println(testCal.getMonth());
        System.out.println(testCal.getDay());

        //testCal.setMonth("july");
        System.out.println(testCal.getMonth());

        System.out.println(testCal2.getYear());
        System.out.println(testCal2.getMonth());
        System.out.println(testCal2.getDay());

        System.out.println(testCal3.getYear());
        System.out.println(testCal3.getMonth());
        System.out.println(testCal3.getDay());

        testCal.isBefore(testCal3);

    }
}