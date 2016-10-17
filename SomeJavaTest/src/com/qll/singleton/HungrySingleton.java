package com.qll.singleton;

public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();//浪费资源
	
	private HungrySingleton(){
		System.out.println("I am hungry singleton");
	}
	public static HungrySingleton getInstance(){
		return instance;
	}
}
