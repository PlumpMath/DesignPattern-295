package co.kr.hapoida.chapter04.factory.framework;


public abstract class Factory {
	
	public final Product create(String owner){
		Product p = createProduct(owner, getIdNumber());
		registerProduct(p);
		return p;
	}
	private long getIdNumber() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
	}
	protected abstract void registerProduct(Product p);
	protected abstract Product createProduct(String owner, long idNumber);
}
