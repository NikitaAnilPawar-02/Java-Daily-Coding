class ThreadExample{
	public static void main(String args[])throws Exception{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
		  System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for(int i = 41; i <= 50; i++) {
            try {
                Thread.sleep(2000);
		System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
