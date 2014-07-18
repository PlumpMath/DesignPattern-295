package co.kr.hapoida.chapter02.adapter.inteface;

import co.kr.hapoida.chapter02.adapter.Banner;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	public String printWeak() {
		return showWithParent();
	}

	public String printStrong() {
		return showWithAster();
	}

}
