package se.iths.martin.v2;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public double distanceTo(Point p) {
        int deltaX = this.getX() - p.getX();
        int deltaY = this.getY() - p.getY();

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
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

    @Override
    public boolean equals(Object obj) {
        Point p1 = (Point) obj;
        if (this.getX() == p1.getX() && this.getY() == p1.getY())
            return true;

        return false;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(4,5);
        Point p4 = new Point();
        System.out.println("Avståndet mellan p1 och p2 är: " + p1.distanceTo(p2));
        System.out.println("Är p1 == p2?: " + p1.equals(p2));
        System.out.println("Är p2 == p3?: " + p2.equals(p3));
    }
}
