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
            System.out.println("The Hour can not be smaller than 0 and bigger than 23");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 50){
            this.minute = minute;
        } else {
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
        String hour, minute, second;
        if (this.hour < 10) {
            hour = "0" + this.hour;
        } else {
            hour = "" + this.hour;
        }
        if (this.minute < 10) {
            minute = "0" + this.minute;
        } else {
            minute = "" + this.minute;
        }
        if (this.second < 10) {
            second = "0" + this.second;
        } else {
            second = "" + this.second;
        }
        return hour + ":" + minute + ":" + second  ;
    }
    public TimeEx8 nextSecond(){
        if(second<59){
            second++;
        }else if(minute<59){
            minute++;
            second=0;
        }else if(hour<23){
            hour++;
            minute=0;
            second=0;
        }else {
            hour=0;
            minute=0;
            second=0;
        }

        return this;
    }
    public TimeEx8 previousSecond(){
        if(second>0){
            second--;
        }else if(minute>0){
            minute--;
            second=59;
        }else if(hour>0){
            hour--;
            minute=59;
            second = 59;
        }else {
            hour=23;
            minute=59;
            second=59;
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