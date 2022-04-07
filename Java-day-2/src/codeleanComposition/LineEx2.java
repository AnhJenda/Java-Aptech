package codeleanComposition;

public class LineEx2 {
    private PointEx2 begin,end;

    public LineEx2(int x1,int y1,int x2,int y2) {
        this.begin = new PointEx2(x1,y1);
        this.end = new PointEx2(x2,y2);
    }

    public LineEx2(PointEx2 begin, PointEx2 end) {
        this.begin = begin;
        this.end = end;
    }

    public void setBegin(PointEx2 begin) {
        this.begin = begin;
    }

    public void setEnd(PointEx2 end) {
        this.end = end;
    }

    public PointEx2 getBegin() {
        return begin;
    }

    public PointEx2 getEnd() {
        return end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x,int y){
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getBeginXY(){
        return  begin.getXY();
    }

    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x,int y){
        end.setX(x);
        end.setY(y);
    }

    public int[] getEndXY(){
        return  end.getXY();
    }

    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient(){
        double x = begin.getX()-end.getX();
        double y = begin.getY()-end.getY();
        return Math.atan2(y,x);
    }

    public double distance(int x, int y){
        double x1=begin.getX();
        double y1=begin.getY();
        double x2=end.getX();
        double y2=end.getY();
        double t = (y1-y2)*(x-x1) + (x2-x1)*(y-y1);
        double m = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
        double res = Math.abs(t/m);
        return  res;
    }

    public double distance(PointEx2 point){
        double x1=begin.getX();
        double y1=begin.getY();
        double x2=end.getX();
        double y2=end.getY();
        double t = (y1-y2)*(point.getX()-x1) + (x2-x1)*(point.getY()-y1);
        double m = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
        double res = Math.abs(t/m);
        return  res;
    }


    public boolean intersects(LineEx2 another){
        double x1=another.getBeginX();
        double y1=another.getBeginY();
        double x2=another.getEndX();
        double y2=another.getEndY();
        double x3=another.getBeginX();
        double y3=another.getBeginY();
        double x4=another.getEndX();
        double y4=another.getEndY();


        double check1 = (y1-y2)*(begin.getX()-x1) + (x2-x1)*(begin.getY()-y1);
        double check2 = (y1-y2)*(end.getX()-x1) + (x2-x1)*(end.getY()-y1);
        double check3 = (y3-y4)*(begin.getX()-x3) + (x4-x3)*(begin.getY()-y3);
        double check4 = (y3-y4)*(end.getX()-x3) + (x4-x3)*(end.getY()-y3);

        if (check1*check2 < 0 || check3*check4 < 0){
            return true;
        } else {
            return false;
        }
    }
}
