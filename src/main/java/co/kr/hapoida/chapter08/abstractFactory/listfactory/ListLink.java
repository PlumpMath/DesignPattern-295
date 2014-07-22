package co.kr.hapoida.chapter08.abstractFactory.listfactory;

import co.kr.hapoida.chapter08.abstractFactory.factory.Link;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
