/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int s1 = Integer.parseInt(args[0]);
		int s2 = Integer.parseInt(args[1]);
		int s3 = Integer.parseInt(args[2]);
		if (((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s1 + s3) > s2)) {
		System.out.println(s1 + ", " + s2 + ", " + s3 + ": true");
		} else {
		System.out.println(s1 + ", " + s2 + ", " + s3 + ": false");
		}
	}
}