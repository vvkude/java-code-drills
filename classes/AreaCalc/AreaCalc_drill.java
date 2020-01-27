import java.util.*;
interface AreaCalStyle // Using a blueprinting method to instruct classes on what to do
{
    void circle();
}
class AreaOfCircles implements AreaCalStyle
{
    double area;
    plublic void circle(double r)
    {
        area= (22*r*r)/7;
    }
    public static void main(String args[])
    {
        AreaOfCircle x;
        Scanner s= new Scanner(System.in);
        System.out.println("Type in the radius of a circle:");
        double rad= s.nextDouble();
        x= new AreaOfCircle();
        x.circle(rad);
        System.out.println("The area of the circle is: " + x.area);
    }
}