package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		int i = b;
		long l = 1234567;
		
		System.out.println(i + 1 + 10);
		System.out.println(i + 1 + b + 10);
		
		char j = (char)i;
		System.out.println(j);

	}

}
