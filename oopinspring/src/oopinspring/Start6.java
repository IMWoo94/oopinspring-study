package oopinspring;

public class Start6 extends Thread{
	static int share;
	
	public static void main(String[] args) {
		Start6 t1 = new Start6();
		Start6 t2 = new Start6();
		
		t1.start();
		t2.start();
	}
	

	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.println(share++);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}

}
