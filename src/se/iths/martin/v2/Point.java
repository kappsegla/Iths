package se.iths.martin.v2;

//Deklaration av klassen Point som vi sedan
//kan använda som mall för att skapa objekt av typen Point som kan lagra två koordinater, x och y.
public class Point {
    //Attribut eller fält som används för att lagra informationen.
    //Bör vara privata och användas via getters/setters
    private int x;
    private int y;

    //Default konstruktor. Använder constructor chaining för att skicka vidare till annan konstruktor.
    public Point() {
        this(0, 0);
    }

    //Konstruktor för Point klassen som tar 2 argument. Sparar dessa i interna fälten.
    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    //Metod som får en referens till ett annat point objekt som argument.
    //Beräknar distansen mellan det egna objektet och det inskickade med hjälp av pythagoras sats.
    public double distanceTo(Point p) {
        int deltaX = this.getX() - p.getX();
        int deltaY = this.getY() - p.getY();

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }

    //Getter metod för x-coordinaten
    public int getX() {
        return x;
    }
    //Setter metod för x-coordinaten
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //equals är en metod där vi ersätter en redan färdig metod som finns på alla objekt i java.
    //Har till uppgift att jämföra två objekt med varandra och returnera true om dessa är lika
    @Override
    public boolean equals(Object obj) {
        Point p1 = (Point) obj;
        if (this.getX() == p1.getX() && this.getY() == p1.getY())
            return true;

        return false;
    }

    //Statisk metod main som låter oss starta Point klassen och testköra denna.
    //Kommer inte påverka om vi skapar objekt av Point i andra applikationer.
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
