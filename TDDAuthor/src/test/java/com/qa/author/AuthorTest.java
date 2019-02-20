package com.qa.author;
	
import static org.junit.Assert.*;
import org.junit.Test;
	
public class AuthorTest {
	
	@Test 
	public void testAuthor() {
		Author testing = new Author();
		assertNull(testing.getName());
	}
	
	@Test 
	public void testAuthorString() {
		Author testing = new Author("a");
		assertNotNull(testing.getName());
	}
	
	@Test 
	public void testSetName() {
		Author testing = new Author();
		testing.setName("a");
		assertEquals("This is not a kitten!","b", testing.getName());
	}
	
	@Test
	public void testStartSame() {
		Author andy = new Author("Andy");
		Author andrew = new Author("Andrew");
//		assertEquals(andy.getName(),andrew.getName());
		if (andy.getName().startsWith(andrew.getName())) {
			fail("They are not the same");
		}
		
	}

}
