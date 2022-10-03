public class Point {

    //instance variable
    private int x;
    private int y;

    //constructor that accepts both instance values
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //constructor that has one parameters
    public Point(int value) {
       x = value;
       y = value;
    }

    //constructor that has no value
    public Point() {
        x =0;
        y = 0;
    }

    //"getter" method for x instance variable
    public int getX() {
        return x;
    }

    //"getter" for method y instance variable
    public int getY() {
        return y;
    }

    //"setter" method for x instance variable
    public void setX(int newX) {
        x = newX;
    }

    //"setter" method for y instance variable
    public void setY(int newY) {
        y = newY;
    }

    //method that returns coordinate string
    public String coordinate() {
        return "(" + x +"," + y +")";
    }

    //method that returns  quadrant of point
    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        }
        else if (x ==0 && y ==0) {
            quadrant = "origin";
        }
        else {
            quadrant = "on an axis";
        }
        return quadrant;
    }


}
