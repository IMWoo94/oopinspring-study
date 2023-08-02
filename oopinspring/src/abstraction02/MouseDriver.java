package abstraction02;

public class MouseDriver {

	public static void main(String[] args) {
		Mouse.countOfTail = 1;
		
		Mouse mickey = new Mouse();
		Mouse jerry = new Mouse();
		Mouse mightyMouse = new Mouse();
		
		System.out.println(mickey.countOfTail);
		System.out.println(jerry.countOfTail);
		System.out.println(mightyMouse.countOfTail);
		
		System.out.println(Mouse.countOfTail);
		
		
	}

}
