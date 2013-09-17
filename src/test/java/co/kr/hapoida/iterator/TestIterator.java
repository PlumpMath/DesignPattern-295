package co.kr.hapoida.iterator;


import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestIterator {
	
	String[] bookNames = {"Around the world in 80 Days","Bible","Cinderella","Daddy-long_legs"};
	
	@Test
	public void test_Iterator∆–≈œ(){
		Bookshelf bookshelf = new Bookshelf(4);
		bookshelf.appendBook(new Book(bookNames[0]));
		bookshelf.appendBook(new Book(bookNames[1]));
		bookshelf.appendBook(new Book(bookNames[2]));
		bookshelf.appendBook(new Book(bookNames[3]));
		
		Iterator it = bookshelf.iterator();
		
		int bookNameIdx = 0;
		
		while (it.hasNext()) {
			Book book = (Book) it.next();
			assertThat(book.getName() , is(bookNames[bookNameIdx]));
			bookNameIdx++;
		}
		
	}
}
