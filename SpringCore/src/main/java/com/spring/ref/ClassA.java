package com.spring.ref;

import java.util.List;

public class ClassA {

	private int x;
		
	private ClassB refb;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ClassB getRefb() {
		return refb;
	}

	public void setRefb(ClassB refb) {
		this.refb = refb;
	}

	public ClassA(int x, ClassB refb) {
		super();
		this.x = x;
		this.refb = refb;
	}

	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Class A:x = "+ this.x+ " Class B:y  "+ this.refb.getY();
	}


	
}
