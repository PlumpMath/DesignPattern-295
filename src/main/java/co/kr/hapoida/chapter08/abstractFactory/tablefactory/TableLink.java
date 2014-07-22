package co.kr.hapoida.chapter08.abstractFactory.tablefactory;

import co.kr.hapoida.chapter08.abstractFactory.factory.Link;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\""+ url + "\">" + caption + "</a></td>\n";
	}

}
