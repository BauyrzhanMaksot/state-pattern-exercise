package com.example.examplestatemachine;

public class q4 implements State{
	protected StateContext sc;
    protected boolean accept = false;
    
    public q4(StateContext temp) {
    	sc = temp;
    }
    
	public void actionA() {
		sc.setStateQ4();
	}
	 public void actionB() {
		sc.setStateQ2();
	 }
	public boolean isAccept() {
        return this.accept;
    }
}
