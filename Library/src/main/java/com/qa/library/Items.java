package com.qa.library;

public class Items extends Library {
	
	private String name;
	private int numOfPages;
	private boolean hasReturned;	

	public boolean isHasReturned() {
		return hasReturned;
	}

	public void setHasReturned(boolean hasReturned) {
		this.hasReturned = hasReturned;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public Items(String name, int numOfPages, boolean hasReturned) {
		this.name = name;
		this.numOfPages = numOfPages;
		this.hasReturned = hasReturned;
		ItemManager.itemslist.add(this);
	}
	
	public Items() {
		
	}

}
