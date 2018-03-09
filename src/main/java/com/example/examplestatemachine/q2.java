package com.example.examplestatemachine;

public class q2 implements State{
	protected StateContext sc;
    protected boolean accept = true;
    
    public q2(StateContext temp) {
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
