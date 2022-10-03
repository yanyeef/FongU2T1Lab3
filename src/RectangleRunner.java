public class RectangleRunner {
    public static void main(String[] args)
    {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        System.out.println("Plot 1 length: " + plot1.getLength());
        System.out.println("Plot 1 width: " + plot1.getWidth());
        System.out.println("Plot 1 area: " + plot1.getArea());
        System.out.println();

        System.out.println("Plot 2 length: " + plot2.getLength());
        System.out.println("Plot 2 width: " + plot2.getWidth());
        System.out.println("Plot 2 area: " + plot2.getArea());
        System.out.println();

        System.out.println("Plot 3 length: " + plot3.getLength());
        System.out.println("Plot 3 width: " + plot3.getWidth());
        System.out.println("Plot 3 area: " + plot3.getArea());
        System.out.println();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75); // keep plot 2 a square


        System.out.println("Plot 1 length: " + plot1.getLength());
        System.out.println("Plot 1 width: " + plot1.getWidth());
        System.out.println("Plot 1 area: " + plot1.getArea());
        System.out.println();

        System.out.println("Plot 2 length: " + plot2.getLength());
        System.out.println("Plot 2 width: " + plot2.getWidth());
        System.out.println("Plot 2 area: " + plot2.getArea());
        System.out.println();

        System.out.println("Plot 3 length: " + plot3.getLength());
        System.out.println("Plot 3 width: " + plot3.getWidth());
        System.out.println("Plot 3 area: " + plot3.getArea());

        int len = 65;
        int wid = len + 10;
        Rectangle rect1 = new Rectangle(len, wid);
        Rectangle rect = new Rectangle(10, 30);
        Rectangle rect3 = new Rectangle(0);





    }
}
