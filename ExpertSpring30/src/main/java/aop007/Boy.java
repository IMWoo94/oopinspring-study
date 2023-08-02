package aop007;

public class Boy implements Person{
	public void runSomething(){
		System.out.println("컴퓨터로 게임을 한다.");
		System.out.println("컴퓨터로 게임을 한다.");
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("일부러 입셉션");
		}
		
	};

}
