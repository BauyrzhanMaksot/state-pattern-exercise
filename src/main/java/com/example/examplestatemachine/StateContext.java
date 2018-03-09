package com.example.examplestatemachine;

public class StateContext {
	
	private boolean accept;
	private State stater;
	
	public StateContext () {
		accept = false;
		stater = new q0(this);
	}
	public void actionA() {
		stater.actionA();
	}
	public void actionB () {
		stater.actionB();
	}
	
	public boolean isAccept() {
		return stater.isAccept();
	}
	
	public void setStateQ1() {
		stater = new q1(this);
	}
	
	public void setStateQ2() {
		stater = new q2(this);
	}
	
	public void setStateQ3() {
		stater = new q3(this);
	}
	
	public void setStateQ4() {
		stater = new q4(this);
	}
}
