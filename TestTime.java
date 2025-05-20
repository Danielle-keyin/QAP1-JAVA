public class TestTime {
    public static void main(String[] args) {
        // Create two time objects that are "bljavacank"
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Time set as requested
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Show the time before changing
        System.out.println("Before:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());

        // Advance T1 by one second
        t1.nextSecond();

        // Go back one second in t2
        t2.previousSecond();

        // Show the final times
        System.out.println("\nAfter:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());
    }
}
