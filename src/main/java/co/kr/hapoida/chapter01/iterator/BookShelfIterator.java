package co.kr.hapoida.chapter01.iterator;

import co.kr.hapoida.chapter01.iterator.array.Book;
import co.kr.hapoida.chapter01.iterator.array.Bookshelf;


public class BookShelfIterator implements Iterator{

	private Bookshelf bookshelf;
	private int index;
	
	public BookShelfIterator(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;
	}

	public boolean hasNext() {
		if(index < bookshelf.getLength()){
			return true;
		} else {
			return false;
		}
			
	}

	public Object next() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}
