package com.qll.singleton;

public enum Foo {
	RED,
	YELLOW,
	GREEN,
	GRY;
	
	private int index;
	
	void setIndex(int idx){
		this.index = idx;
	}
	int getIndex(){
		return index;
	}
}
