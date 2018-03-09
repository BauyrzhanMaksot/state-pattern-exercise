package com.example.examplestatemachine;

public class q3 implements State{
	protected StateContext sc;
    protected boolean accept = false;
    
    public q3(StateContext temp) {
    	sc = temp;
    }
    
	public void actionA() {
		sc.setStateQ1();
	}
	 public void actionB() {
		sc.setStateQ2();
	 }
	public boolean isAccept() {
        return this.accept;
    }
}