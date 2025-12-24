import java.util.*;

class SynchronizationExample{
	public static void main(String args[]){
		Counter counter = new Counter();
		Thread1 t1 = new Thread1(counter);
		Thread2 t2 = new Thread2(counter);
		t1.start();
		t2.start();
		
	}
}

class Thread1 extends Thread{
	Counter c;
	Thread1(Counter c){
		this.c = c;
	}

	public void run(){
		c.increment();
	}
}

class Thread2 extends Thread{
	Counter c;
	Thread2(Counter c){
		this.c = c;
	}

	public void run(){
		c.increment();
	}
}


class Counter{
	int count = 0;
	synchronized void increment(){
		for(int i=1; i<=10; i++){
			count++;
			System.out.println(Thread.currentThread().getName() + " : " + count);
		}
	}
}

