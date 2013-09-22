package co.kr.hapoida.chapter01.iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter01.iterator.Iterator;
import co.kr.hapoida.chapter01.iterator.array.Book;
import co.kr.hapoida.chapter01.iterator.arrayList.ArrayListBookShelf;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestArrayListIterator {
	String[] bookNames = {"Around the world in 80 Days","Bible","Cinderella","Daddy-long_legs","servlet-jsp"};
	
	private ArrayListBookShelf bookshelf;
	
	@Before
	public void init_선반정보세팅(){
		bookshelf = new ArrayListBookShelf();
		bookshelf.appendBook(new Book(bookNames[0]));
		bookshelf.appendBook(new Book(bookNames[1]));
		bookshelf.appendBook(new Book(bookNames[2]));
		bookshelf.appendBook(new Book(bookNames[3]));
		bookshelf.appendBook(new Book(bookNames[4]));
	}
	
	@Test
	public void test_Iterator패턴(){
		Iterator it = bookshelf.iterator();
		
		int bookNameIdx = 0;
		
		while (it.hasNext()) {
			Book book = (Book) it.next();
			
			assertThat(book.getName() , is(bookNames[bookNameIdx]));
			
			bookNameIdx++;
		}
		
	}
}
