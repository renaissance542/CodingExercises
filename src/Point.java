public class Point {
    private int x;
    private int y;

    public double distance(){
        // the square root of x^2 + y^2 is the distance
        return (Math.sqrt(x*x + y*y));
    }

    public double distance(int x, int y){
        return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }

    public double distance (Point newPoint){
        return (Math.sqrt((this.x - newPoint.x) * (this.x - newPoint.x) + (this.y - newPoint.y) * (this.y - newPoint.y)));
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
