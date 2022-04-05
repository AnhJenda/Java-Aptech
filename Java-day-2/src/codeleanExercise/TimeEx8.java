package codeleanExercise;

public class TimeEx8 {
    private int hour;
    private int minute;
    private int second;

    public TimeEx8(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("The Hour can not be smaller than 0 and bigger than 23");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("The minute can not be smaller than 0 and bigger than 59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("The second can not be smaller than 0 and bigger than 59");
        }
    }
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("The input is not validation");
        }
    }

    @Override
    public String toString() {
        return String.format("%2d:%2d:%2d", this.hour, this.minute, this.second);
    }
    public TimeEx8 nextSecond(){
        second++;
        if(second >= 60){
           this.second = 0;
           minute++;
           if (minute >= 60){
               this.minute = 0;
               hour++;
               if (hour >=24){
                   this.hour = 0;
               }
           }
        }
        return this;
    }
    public TimeEx8 previousSecond(){
        second--;
        if (second < 0) {
            this.second = 59;
            minute--;
            if (minute < 0) {
                this.minute = 59;
                hour--;
                if (hour < 0){
                    this.hour--;
                }
            }
        }
        return this;
    }

    public static void main(String[] args) {
        TimeEx8 time1 = new TimeEx8(0,0,0);
        TimeEx8 time2 = new TimeEx8(23,59,59);
        TimeEx8 time3 = new TimeEx8(1, 10, 20);
        TimeEx8 time4 = new TimeEx8(1, 10, 21);
        System.out.println(time1.previousSecond());
        System.out.println(time2.nextSecond());
        System.out.println(time3.previousSecond());
        System.out.println(time4.nextSecond());
    }
}