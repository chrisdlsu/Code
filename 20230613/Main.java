public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        MyDate testCal = new MyDate(1995, 12, 4);

        System.out.println(testCal.getYear());
        System.out.println(testCal.getMonth());
        System.out.println(testCal.getDay());

        testCal.setMonth("july");
        System.out.println(testCal.getMonth());

    }
}