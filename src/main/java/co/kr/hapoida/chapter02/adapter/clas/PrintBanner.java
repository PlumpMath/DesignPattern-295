package co.kr.hapoida.chapter02.adapter.clas;

import co.kr.hapoida.chapter02.adapter.Banner;

public class PrintBanner extends Print{
	
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public String printWeak() {
		return banner.showWithParent();
	}

	@Override
	public String printStrong() {
		return banner.showWithAster();
	}
	
}
