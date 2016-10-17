package com.qll.serializable;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private int age;
	private boolean gender;
	private transient String simple;
	public static String type = "User Type";
    private static final long serialVersionUID = 1L;

	
	public User(String name,int age,boolean gender,String simple){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.simple = simple;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public boolean getGender(){
		return gender;
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	
	public String getSimple(){
		return simple;
	}
	public void setSimple(String simple){
		this.simple = simple;
	}
	public String toString(){
		return "User{"+ "name="+name+",age="+age+",gender="+gender+",simple="+simple+",type="+type+"}";
		
	}
}
