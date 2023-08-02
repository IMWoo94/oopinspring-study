package staticBlock;

public class Driver05 {

	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		System.out.println(Animal.age);
		Animal a = new Animal();
		Animal b = new Animal();
	}
	

}

class Animal {
	
	static int age = 0;
	
	static {
		System.out.println("animal class ready on");
	}
	
	{
		System.out.println("instance block");
	}
	
	public Animal() {
		System.out.println("animal constructor");
	}
}
