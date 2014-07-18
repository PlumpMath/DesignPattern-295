package co.kr.hapoida.chapter02.adapter;

public class Banner {
	private String string;
	
	public Banner(String string){
		this.string = string;
	}
	
	public String showWithParent(){
		System.out.println("(" + string + ")");
		return "(" + string + ")";
	}
	
	public String showWithAster(){
		System.out.println("*" + string + "*");
		return "*" + string + "*";
	}
}
