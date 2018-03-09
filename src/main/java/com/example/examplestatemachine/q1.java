package com.example.examplestatemachine;

public class q1 implements State{
	protected StateContext sc;
    protected boolean accept = true;
    
    public q1(StateContext temp) {
    	sc = temp;
    }
    
	public void actionA() {
		sc.setStateQ1();
	}
	 public void actionB() {
		sc.setStateQ3();
	 }
	public boolean isAccept() {
        return this.accept;
    }
}
