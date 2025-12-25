class SynchronizedThread{
	public static void main(String args[]){
		Counter c = new Counter();
		Thread1 t1 = new Thread1(c);
		t1.start();
		Thread2 t2 = new Thread2(c);
		t2.start();
	}
}

class Thread1 extends Thread{
	Counter c;
	public Thread1(Counter c){
		this.c = c;
	}
		
	public void run(){
		c.increment();
	}
}

class Thread2 extends Thread{
	Counter c;
	public Thread2(Counter c){
		this.c = c;
	}
		
	public void run(){
		c.increment();
	}
}

class Counter{
	int count =0;
	synchronized void increment(){
		for(int i=1; i<=10; i++){
			count++;
			System.out.println(count);
		}
	}
}
