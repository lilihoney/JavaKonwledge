package com.qll.singleton;

public class StaticInnerClassSingleton {
	
	private StaticInnerClassSingleton(){
		System.out.println("I am static inner class singleton");
	}
	
	private static class initInstance{
		private static StaticInnerClassSingleton Instance = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance(){
		return initInstance.Instance;
	}

}
