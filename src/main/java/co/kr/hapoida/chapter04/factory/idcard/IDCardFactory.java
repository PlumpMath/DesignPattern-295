package co.kr.hapoida.chapter04.factory.idcard;

import java.util.ArrayList;
import java.util.List;

import co.kr.hapoida.chapter04.factory.framework.Factory;
import co.kr.hapoida.chapter04.factory.framework.Product;

public class IDCardFactory extends Factory{

	private List<String> owners = new ArrayList<String>();
	
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	@Override
	protected Product createProduct(String owner, long idNumber) {
		return new IDCard(owner, idNumber);
	}
	
	public List getOwners(){
		return owners;
	}

}
