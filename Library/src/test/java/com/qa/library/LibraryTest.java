package com.qa.library;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibraryTest {
	
	ItemManager im = new ItemManager();		
	Book bookAuto = new Book("Book Two",150,false);
	Book bookAuto2 = new Book("Book One",200,true);
	
	@Test
	public void isNameTest() {
		Member lib = new Member("Bruno",23);
		assertEquals("Bruno",lib.getName());
	}
	
	@Test
	public void bookReturnedTest() {
		bookAuto.setHasReturned(true);
		assertEquals(true,bookAuto.isHasReturned());
	}
	
	@Test
	public void addItemTest() {
		String boook2 = "";
		for (Items i : ItemManager.itemslist.stream().filter(string -> (string.equals(bookAuto.getName()))).collect(Collectors.toList())) {
			boook2 += i.getName();
		}
		System.out.println(boook2);
	}

	@Test
	public void removeItemTest() {	
		im.itemslist.remove(bookAuto);
		String boook3 = "";
		for (Items i : im.itemslist) {
			boook3 += i.getName() + " ";
		}
		assertEquals("Book One ", boook3);
	}
	
//	@Test
//	public void 

}