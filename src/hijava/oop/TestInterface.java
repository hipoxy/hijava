package hijava.oop;

public interface TestInterface {
	public ResultSet select(String sql) throws SQLExticepon;
	
	default void print(String str) {
		System.out.println(str);
	}

}
