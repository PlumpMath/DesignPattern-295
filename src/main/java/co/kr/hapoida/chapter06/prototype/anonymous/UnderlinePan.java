package co.kr.hapoida.chapter06.prototype.anonymous;

import co.kr.hapoida.chapter06.prototype.framwork.Product;

public class UnderlinePan extends Product{
	private char ulchar;
	
	public UnderlinePan(char ulchar) {
		this.ulchar = ulchar;
	}
	
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}

	

}
