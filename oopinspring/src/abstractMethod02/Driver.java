package abstractMethod02;

public class Driver {

	public static void main(String[] args) {
		동물[] 동물들 = new 동물[5];
		
		동물들[0] = new 쥐();
		동물들[1] = new 고양이();
		동물들[2] = new 강아지();
		동물들[3] = new 송아지();
		동물들[4] = new 병아리();
		
		for(동물 animal : 동물들) {
			animal.울어보세요();
		}
	}

}
