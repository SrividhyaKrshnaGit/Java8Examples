package com.lamba.expression;

interface PrintInterface{
	void print(int a,String name);
}

public class LambaExample1{
	
	public static void main(String[] args) {
		
		PrintInterface printInt = new PrintInterface() {
			
			@Override
			public void print(int a,String name) {
                 System.out.println(" printable interface " +a +" "+name );				
			}
		};
		
		printInt.print(1,"Ram");
		
		PrintInterface printInterface = (a,b) -> System.out.println(" The id and name are  " + a +" "+b);
		printInterface.print(1,"Ram");
	
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
          System.out.println( "Runnable method "); 			
		}
	};
	
	Thread t = new Thread(runnable);
	t.start();
	
	Runnable run = () -> System.out.println("The lamba runnable method");
	Thread t1 = new Thread(run);
	t1.start();
		
	}
}
