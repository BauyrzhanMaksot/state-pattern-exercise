package com.example.examplestatemachine;

public interface State {
	StateContext sc = new StateContext();
    boolean accept = false;
    
    public void actionA();
    
    public void actionB();
    
    public boolean isAccept();
}

