package com.qa.cage;

public class Cage<T> {
	public T obj;
	
	public void insert(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}
