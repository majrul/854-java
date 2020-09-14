package com.lti.basics.abstractkeyword;

//think about component means - button, label, checkbox, radio button, etc...
public abstract class Component {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract void draw();
}
