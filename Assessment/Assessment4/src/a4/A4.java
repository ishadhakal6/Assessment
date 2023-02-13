package a4;


class message extends Thread{
	public void run() {
		
			for(int i=1; i<=100; i++) {
				System.out.println("Hello World");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		
	}
}

public class A4 {
	public static void main(String[] args) {
		message m=new message();
		m.start();
	}

}
