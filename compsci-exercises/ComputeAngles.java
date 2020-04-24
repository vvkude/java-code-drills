// Assignment: Compute the angles of a triangle given user input for the points

import java.util.Scanner;

public class ComputeAngles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// TODO change this to prompt the user for three points
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		// TODO should use Triangle Inequality Theorem to check that the sum of any 2
		// sides of a triangle must be greater than the measure of the third side

		// Compute the length of the sides first
		double a = Math.sqrt((x2 - x3) * (x2 - x3) 
			+ (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3)
			+ (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2)
			+ (y1 - y2) * (y1 - y2));

		// Use the arccosine(x) to compute the angles of the triangle
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
			/ (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
			/ (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
			/ (-2 * a * b)));

		// Output results to the user for review
		System.out.println("The three angles are " +
			Math.round(A * 100) / 100.0 + " " + 
			Math.round(B * 100) / 100.0 + " " +
			Math.round(C * 100) / 100.0);
	}
}