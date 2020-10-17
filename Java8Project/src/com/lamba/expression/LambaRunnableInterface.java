package com.lamba.expression;

public class LambaRunnableInterface {

	public static void main(String[] args) {
		//Runnable Functional Interface ru method can be implemented suing Lamba Expression
		Runnable runnable = ()->System.out.println("Lamba expression imlementing run method of Runnable interface");
	    runnable.run();
		Thread thread = new Thread(runnable);
	    thread.start();
	}

}
