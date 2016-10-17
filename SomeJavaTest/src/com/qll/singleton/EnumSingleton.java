package com.qll.singleton;

public enum EnumSingleton {
	INSTANCE;
	private EnumSingleton getInstance(){
		return INSTANCE;
	}
	public void print(){
		System.out.println("I am a enum singleton");
	}		
}
