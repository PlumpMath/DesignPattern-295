package co.kr.hapoida.chapter08.abstractFactory.listfactory;

import co.kr.hapoida.chapter08.abstractFactory.factory.Factory;
import co.kr.hapoida.chapter08.abstractFactory.factory.Link;
import co.kr.hapoida.chapter08.abstractFactory.factory.Page;
import co.kr.hapoida.chapter08.abstractFactory.factory.Tray;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
	
}
