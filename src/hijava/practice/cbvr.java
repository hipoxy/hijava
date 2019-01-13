package hijava.practice;

public class cbvr {
	int m = 2;

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i1=" + 1);
		
		change1(i);
		System.out.println("i2=" + 1);
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m);
		
		change2(cb1);
		System.out.println("cb2=" + cb1.m);
		
		}

	public static void main(String[] args)
}
