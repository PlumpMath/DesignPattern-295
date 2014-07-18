package co.kr.hapoida.chapter01.iterator.arrayList;

import java.util.ArrayList;

import co.kr.hapoida.chapter01.iterator.Aggreate;
import co.kr.hapoida.chapter01.iterator.Iterator;
import co.kr.hapoida.chapter01.iterator.array.Book;

public class ArrayListBookShelf implements Aggreate{
	
	private ArrayList<Book> books;
	private int last = 0;
	
	public ArrayListBookShelf(){
		this.books = new ArrayList<Book>();
	}
	public Book getBookAt(int index){
		return books.get(index);
	}
	public void appendBook(Book book){
		books.add(book);
	}
	public int getLength(){
		return books.size();
	}
	
	public Iterator iterator() {
		return new BookArrayListShelfIterator(this);
	}

}
