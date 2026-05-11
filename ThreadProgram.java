class Number{
	synchronized void printeven(){
		System.out.println("\n\nEven numbers:");
		
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
	
	synchronized void printodd(){
		System.out.println("\n\nOdd numbers:");
		
		for(int i=1;i<=50;i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
	}
}

class eventhread extends Thread{
	Number n;
	
	eventhread(Number n){
		this.n=n;
	}
	public void run(){
		n.printeven();
	}
}


class oddthread extends Thread{
	Number n;
	
	oddthread(Number n){
		this.n=n;
	}
	public void run(){
		n.printodd();
	}
}

public class ThreadProgram{
	public static void main(String args[]){
		Number obj=new Number();
		
		eventhread e=new eventhread(obj);
		oddthread o=new oddthread(obj);
		
		e.start();
		o.start();
	}
}