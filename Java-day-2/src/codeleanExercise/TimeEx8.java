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
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + "/" + minute + "/" + second  ;
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
        TimeEx8 time1 = new TimeEx8(7,0,0);
        TimeEx8 time2 = new TimeEx8(6,59,59);
        System.out.println(time1.previousSecond());
        System.out.println(time2.nextSecond());
    }
}