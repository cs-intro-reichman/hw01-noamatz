/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int fin;
		int Min = Integer.parseInt(args[0]);
		int Max = Integer.parseInt(args[1]);
		int x = Min + (int)(Math.random() * (Max - Min));
		int y = Min + (int)(Math.random() * (Max - Min));
		int z = Min + (int)(Math.random() * (Max - Min));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		fin = Math.min(Math.min(x,y),z);
		System.out.println("The minimal generated number was " + fin);

	}
}