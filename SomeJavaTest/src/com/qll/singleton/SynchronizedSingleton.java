package com.qll.singleton;
/**
 * 效率差，线程安全
 * */
public class SynchronizedSingleton {
	private static SynchronizedSingleton instanceSingleton = null;
	
	private SynchronizedSingleton(){
		System.out.println("I am a Synchronized Singleton");
	}
	
	public synchronized static SynchronizedSingleton getInstance(){
		if(instanceSingleton == null){
			instanceSingleton = new SynchronizedSingleton();
		}
		return instanceSingleton;
	}
}
