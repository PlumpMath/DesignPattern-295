package co.kr.hapoida.chapter08.abstractFactory.tablefactory;

import co.kr.hapoida.chapter08.abstractFactory.factory.Factory;
import co.kr.hapoida.chapter08.abstractFactory.factory.Link;
import co.kr.hapoida.chapter08.abstractFactory.factory.Page;
import co.kr.hapoida.chapter08.abstractFactory.factory.Tray;

public class TableFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
