package com.lamba.expression.method_reference;

public class MethodReferencePrint {

	public static void main(String[] args) {
		//Thread t = new Thread(()->print());
		Thread t = new Thread(MethodReferencePrint::print);
		t.start();
		
	}
	
	public static void print() {
		System.out.println("Printing using Method Reference[MethodReferencePrint::print] instead of Lamba equivalent ()->print()");
	}

}
