package co.kr.hapoida.chapter04.factory.idcard;

import co.kr.hapoida.chapter04.factory.framework.Product;

public class IDCard extends Product{
	
	private String owner;
	public IDCard(String owner) {
		this.owner = owner;
		System.out.println(owner + "�� ī�带 ����ϴ�.");
	}
	
	@Override
	public String use() {
		System.out.println(owner + "�� ī�带 ����մϴ�.");
		return owner + "�� ī�带 ����մϴ�.";
	}
	
	public String getOwner(){
		return owner;
	}

}
