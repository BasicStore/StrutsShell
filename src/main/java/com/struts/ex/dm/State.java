package com.struts.ex.dm;

public class State {

	private int x;
	private int y;
	private Sheep sheep;
	
	public State(int x, int y) {
		this.x = x;
		this.y = y;
		this.sheep = new Sheep();  //new Sheep("sheep1ski", "sheep2ski");
		this.sheep.setSheep1("sheep1ski");
		this.sheep.setSheep2("sheep2ski");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}
	
	
	
}
