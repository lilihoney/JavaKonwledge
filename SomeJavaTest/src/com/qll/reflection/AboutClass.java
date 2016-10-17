package com.qll.reflection;

import java.lang.reflect.Constructor;

import com.qll.singleton.StaticInnerClassSingleton;

public class AboutClass {
	public static void main(String[] args) throws ClassNotFoundException{
		StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
		Class class1 = StaticInnerClassSingleton.class;
		Class class2 = singleton.getClass();
		Class class3 = Class.forName("com.qll.singleton.StaticInnerClassSingleton");
		
		System.out.println("class1 == class2 : " + (class1 == class2));//true
		System.out.println("class2 == class3 : " + (class3 == class2));//true
		System.out.println("class1 == class3 : " + (class1 == class3));//true
		
		// private constructor没有打印出来----------私有构造函数可以防止反射
		Constructor[] contructors = class1.getConstructors();
		System.out.println(contructors.length);
		for(Constructor constructor : contructors){
			System.out.println(constructor);
		}
		
		//public constructor可获得
		Class class4 = Class.forName("com.qll.reflection.Person");
		Constructor[] personConstructors = class4.getConstructors();
		for(Constructor constructor : personConstructors){
			System.out.println(constructor);
		}
	}

}
