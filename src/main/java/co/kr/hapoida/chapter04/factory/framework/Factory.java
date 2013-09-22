package co.kr.hapoida.chapter04.factory.framework;

public abstract class Factory {
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract void registerProduct(Product p);
	protected abstract Product createProduct(String owner);
}
