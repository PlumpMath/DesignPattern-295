package co.kr.hapoida.chapter01.iterator.array;

import co.kr.hapoida.chapter01.iterator.Aggreate;
import co.kr.hapoida.chapter01.iterator.BookShelfIterator;
import co.kr.hapoida.chapter01.iterator.Iterator;


public class Bookshelf implements Aggreate{
	private Book[] books;
	private int last = 0;
	public Bookshelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index){
		return books[index];
	}
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	public int getLength(){
		return last;
	}
	
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}
}
