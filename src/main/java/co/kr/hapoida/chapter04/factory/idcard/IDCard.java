package co.kr.hapoida.chapter04.factory.idcard;

import co.kr.hapoida.chapter04.factory.framework.Product;

public class IDCard extends Product{
	
	private String owner;
	public IDCard(String owner) {
		this.owner = owner;
		System.out.println(owner + "의 카드를 만듭니다.");
	}
	
	@Override
	public String use() {
		System.out.println(owner + "의 카드를 사용합니다.");
		return owner + "의 카드를 사용합니다.";
	}
	
	public String getOwner(){
		return owner;
	}

}
