/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int Min = 50;
		int Max = 100;
		int fin;
		int x = Min + (int)(Math.random() * ((Max - Min) + 1));
		int y = Min + (int)(Math.random() * ((Max - Min) + 1));
		int z = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println("Out of the three integers:" + x + ", " + y + ", " + z);
		int first = Math.min(x, y);
		int second = Math.min(y, z);
		fin = Math.min(first, second);
		System.out.println(fin + " is the lowest number");

	}
}