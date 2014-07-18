package co.kr.hapoida.chapter07.builder;

public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitle("Greting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[]{
				"좋안 아침입니다.",
				"안녕하세요"
		});
		builder.makeString("밤에");
		builder.makeItems(new String[]{
				"안녕하세요",
				"안녕히주무세요",
				"안녕히 게세요"
		});
		builder.close();
	}
}
