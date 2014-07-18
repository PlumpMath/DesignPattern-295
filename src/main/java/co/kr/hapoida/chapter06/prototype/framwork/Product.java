package co.kr.hapoida.chapter06.prototype.framwork;

public abstract class Product implements Cloneable{
	public abstract void use(String s);
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
}
