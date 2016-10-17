package com.qll.singleton;

public class SingletonOne {
	private static SingletonOne  instanceOne = null;
	private SingletonOne(){
		System.out.println("I am a lazy singleton");
	}
	
	public static SingletonOne getInstance(){
		if(instanceOne == null){
			instanceOne = new SingletonOne();
		}
		return instanceOne;
	}
}
