class RunnableInterfaceExample{
	public static void main(String args[]){
		Squares s = new Squares();
		Thread t1 = new Thread(s);
		t1.start();
		Thread t2 = new Thread(s);
		t2.start();  
	}
}

class Squares implements Runnable{
	public synchronized void run(){
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName()+ " "+i*i);
		}
	}
}
