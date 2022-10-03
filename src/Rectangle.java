public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor to create a Rectangle object with a particular width and length
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // constructor to create a Rectangle object with equal width and length (a square)
    public Rectangle(int side) {
        length = side;
        width = side;
    }

    // "no-argument" constructor which creates a Rectangle object with default values
    public Rectangle() {
        length = 100;
        width = 50;
    }

    // "getter" method that returns the length of the Rectangle
    public int getLength() {
        return length;
    }
    //"getter" method that eturns the width
    public int getWidth() {
        return width;
    }

    // "setter" methods that sets the length of the Rectangle to a new length
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int getArea() {
        return length*width;

    }
}


