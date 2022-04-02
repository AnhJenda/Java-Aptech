package codeleanExercise;

public class DateEx7 {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("The day can not be smaller than 1 and bigger than 31");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("The month can not be smaller than 1 and bigger than 12");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("The year is not in range");
        }
    }

    public void setDate(int year, int month, int day) {
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900 && year <= 9999) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("The input is not validation!");
        }
    }

    public String toString() {
        String day, month;
        if (this.day < 10) {
            day = "0" + this.day;
        } else {
            day = "" + this.day;
        }
        if (this.month < 10) {
            month = "0" + this.month;
        } else {
            month = "" + this.month;
        }
        return "Date: " + day + "/" + month + "/" + year;
    }
}
