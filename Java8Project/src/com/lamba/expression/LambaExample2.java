package com.lamba.expression;

interface Printable{
	void print(String message);
}
public class LambaExample2 {
	public static void main(String[] args) {
		
		// Lamba expression with Parameter
		Printable printable = (m)->System.out.println(m);
		printable.print("Lamba expression with Single parameter implementing Function Interface");
		
	}

}
