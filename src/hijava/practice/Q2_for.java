package hijava.practice;

public class Q2_for {

	public static void main(String[] args) {
		int line = 4;
		for ( int i = 1; i <= line; i++) {
			
			for (int j = 1; j <= (line * 2 - 1); j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
			
	}

}
