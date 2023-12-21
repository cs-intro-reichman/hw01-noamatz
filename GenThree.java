/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int Min = Integer.parseInt(args[0]);
		int Max = Integer.parseInt(args[1]);
		int fin;
		int x = Min + (int)(Math.random() * ((Max - Min) + 1));
		int y = Min + (int)(Math.random() * ((Max - Min) + 1));
		int z = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int first = Math.min(x, y);
		int second = Math.min(y, z);
		fin = Math.min(first, second);
		System.out.println("The minimal generated number was " + fin);

	}
}