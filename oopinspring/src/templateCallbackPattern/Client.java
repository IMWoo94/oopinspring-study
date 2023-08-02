package templateCallbackPattern;

public class Client {
	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();

		// 총을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("탕, 타당, 타다당");
				
			}
		};
		rambo.runContext(strategy);

		System.out.println();

		// 검을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("챙.. 채쟁챙 챙챙");
				
			}
		};
		rambo.runContext(strategy);

		System.out.println();

		// 활을 람보에게 전달해서 전투를 수행하게 한다.
		strategy = new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("슝.. 쐐액.. 쇅, 최종 병기");
				
			}
		};
		rambo.runContext(strategy);
	}
}