package algorithms;

public class Fibonaccii {

	public static void main(String[] args) {
		
		for (int i = 0; i < 51; i++) {
			
		
		int x = i+1;
		System.out.println(x);
		int y = i+1;
		System.out.println(y);
		int z = x + y;
		System.out.println(z);
		x = z + y;
System.out.println(x);
		
		}
	}
}
