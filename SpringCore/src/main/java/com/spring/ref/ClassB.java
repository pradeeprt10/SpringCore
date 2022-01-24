package com.spring.ref;

public class ClassB {
	private int y;

	public ClassB(int y) {
		super();
		this.y = y;
	}

	public ClassB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ClassB [y=" + y + "]";
	}

}
