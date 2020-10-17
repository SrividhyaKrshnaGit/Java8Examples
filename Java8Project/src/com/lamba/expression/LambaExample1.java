package com.lamba.expression;

interface Drawable{
	void draw();
}

class DrawImpl implements Drawable{

	@Override
	public void draw() {
		System.out.println("Interface method implemented suing Implementing class");
		
	}
	
}

public class LambaExample1 {

	public static void main(String[] args) {
		
		//Using implementing class
		DrawImpl impl = new DrawImpl();
		impl.draw();
		
		//draw method implentation using Anonumous class
		Drawable draw = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Anonymous class implementing interface draw method");
				
			}
		};
		draw.draw();
		
		
		//Function Interface Drawable who method is implemented using Lamba Expression
		
		Drawable drawable = () -> System.out.println("Lamba expression implenting Draw method");
		drawable.draw();
	}

}
