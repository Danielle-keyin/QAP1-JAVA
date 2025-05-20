public class Date {
    // These hold the day, month, and year for the date
    private int day;
    private int month;
    private int year;

    // Constructor to set everything up when the object is created
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Just gives you the day
    public int getDay() {
        return day;
    }

    // Just gives you the month
    public int getMonth() {
        return month;
    }

    // Just gives you the year
    public int getYear() {
        return year;
    }

    // Lets you update just the day
    public void setDay(int day) {
        this.day = day;
    }

    // Lets you update just the month
    public void setMonth(int month) {
        this.month = month;
    }

    // Lets you update just the year
    public void setYear(int year) {
        this.year = year;
    }

    // Sets all three at once
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Nicely formats the date as "dd/mm/yyyy" adding the 0 when needed
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
