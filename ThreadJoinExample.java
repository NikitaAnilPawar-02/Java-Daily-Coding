class ThreadJoinExample{
	public static void main(String args[])throws Exception{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t1.join();
		t2.start();
	}	
}

class Thread1 extends Thread{
	public void run(){
		try{
			for(int i=1;i<=10;i++){
			System.out.println(i*i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		try{
			for(int i=1;i<=10;i++){
			System.out.println(i*i*i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

