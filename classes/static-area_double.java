import java.util.Scanner;
class AreaOfCircle
{
     public static void main(String args[]) // take the input as a string
         {

             Scanner s= new Scanner(System.in); //  use scanner class to scan input data
             
                 System.out.println("Type in the radius of a circle:");
                 double r=s.nextDouble(); // Not sure if this is the best way to tokenize user input
                 double area=(22*r*r)/7; // Not using pow yet, focusing on scanning input
                 System.out.println("The area of the circle is:" + area);
         }
}
      
