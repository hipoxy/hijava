package hijava.oop;

public class Son {
	private String name;

	public Son(String name) {
		this.name = name;

	}

	public Son() {
		this("아들");
	}

	public String getName() {
		return this.name;
	}

	public void eat() {
		System.out.println("drinkMilk");
	}

	public void say() {
		System.out.println("Son said...");

	}

}
