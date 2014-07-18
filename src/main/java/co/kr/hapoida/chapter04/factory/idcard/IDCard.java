package co.kr.hapoida.chapter04.factory.idcard;

import co.kr.hapoida.chapter04.factory.framework.Product;

public class IDCard extends Product{
	
	private String 	owner;
	private long 	idNumber; 
	IDCard(String owner, long idNumber) {
		this.owner 		= owner;
		this.idNumber 	= idNumber;
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
