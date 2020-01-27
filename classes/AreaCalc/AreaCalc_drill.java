import java.util.*;
interface AreaCalStyle // Using a blueprinting method to instruct classes on what to do
{
    void circle();
}
class AreaOfCircles implements AreaCalStyle
{
    double area;
    public void circle(double r)
    {
        area= (22*r*r)/7;
    }
    public static void main(String args[])
    {
        AreaOfCircles x;
        Scanner s= new Scanner(System.in);
        System.out.println("Type in the radius of a circle:");
        double rad= s.nextDouble();
        x=new AreaOfCircles();
        x.circle(rad);
        System.out.println("The area of the circle is: " + x.area);
    }
}