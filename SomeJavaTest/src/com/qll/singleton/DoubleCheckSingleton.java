package com.qll.singleton;

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton instance = null;
	
	private DoubleCheckSingleton(){
		System.out.println("I am double check singleton");
	}
	
	public static DoubleCheckSingleton getInstance(){
		if(instance == null){
			synchronized (DoubleCheckSingleton.class) {
				if(instance == null){
					instance = new DoubleCheckSingleton();//由于java的无序写，在new DoubleCheckSingleton()没有完成时先赋值给了instance
				}
			}
		}
		return instance;
	}
}
