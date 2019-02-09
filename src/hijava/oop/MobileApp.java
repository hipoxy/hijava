package hijava.oop;

public class MobileApp extends Software {
	
	@Override
	public void plan() {
		System.out.println("기획");
	}
	
	@Override
	public void develope() {
		System.out.println("개발");
	}
	
	@Override
	public void release() {
		System.out.println("출시");
	}

	
}
