package co.kr.hapoida.chapter06.prototype.framwork;

import java.util.HashMap;

public class Manager {
	private HashMap<String, Object> showcase = new HashMap<String, Object>();
	public void register(String name, Product proto){
		showcase.put(name, proto);
	}
	public Product create(String protoname){
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
