package finalVariable;

public class 고양이 {

	final static int 정적상수1 = 1;
	final static int 정적상수2;
	
	final int 객체상수1 = 1;
	final int 객체상수2;
	
	static {
		정적상수2 =2;
		
		// 상수는 한 번 초기화 되면 변경 불가
		//정적상수2 = 4;
	}
	
	고양이(){
		객체상수2 = 2;
		
		// 상수는 한 번 초기화 되면 변경 불가
		//객체상수2 = 4;
		
		final int 지역상수1= 1;
		final int 지역상수2;
		
		지역상수2 = 2;
	}
}
