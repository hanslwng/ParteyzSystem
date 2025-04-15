package main;

public class ToDay {

    // Instance variables
    private int day;
    private int month;
    private int year;

    // Constructors
    public ToDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public ToDay() {
    }

    // Getter and setter methods
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public boolean isToDay(ToDay date) {
        return month == date.getMonth()&&  day == date.getDay() && year == date.getYear();
    }
}
