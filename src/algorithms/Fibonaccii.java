package algorithms;

public class Fibonaccii {

	public static void main(String[] args) {

		int num = 0;

		int x = num + 1;
		System.out.println(x);
		int y = num + 1;
		System.out.println(y);
		
		for (int i = 0; i < 10; i++) {
			
		int z = y + x;
		System.out.println(z);
		x = z + y;
		System.out.println(x);

		
		
		y = x + z;
		System.out.println(y);
		z = y + x;
		//System.out.println(num);
		}
	}
}
