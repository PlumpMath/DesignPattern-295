package co.kr.hapoida.iterator.arrayList;

import co.kr.hapoida.iterator.Iterator;
import co.kr.hapoida.iterator.array.Book;

public class BookArrayListShelfIterator implements Iterator{

	private ArrayListBookShelf bookshelf;
	private int index;
	
	public BookArrayListShelfIterator(ArrayListBookShelf arrayListBookShelf) {
		this.bookshelf = arrayListBookShelf;
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
