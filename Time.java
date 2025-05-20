public class Time {
    // Stores the hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // Constructor to set up the time
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get the hour
    public int getHour() {
        return hour;
    }

    // Get the minute
    public int getMinute() {
        return minute;
    }

    // Get the second
    public int getSecond() {
        return second;
    }

    // Set the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Set the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Set the second
    public void setSecond(int second) {
        this.second = second;
    }

    // Set all three at once
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Return the time as a string like "hh:mm:ss" with leading zeroes
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Move forward by 1 second and return this same object
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Go back by 1 second and return this same object
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
