package polymorphism01;

public class Penguin extends Animal{

	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s는 %s에 살아\n", name, habitat);
	}
	
	// 오버 라이딩
	@Override
	public void showName() {
		System.out.println("내 이름을 알아서 뭐하십니까?");
	}
	
	// 오버 로딩
	public void showName(String yourName) {
		System.out.printf("%s 안녕, 나는 %s라고 해\n", yourName, name);
	}

}
