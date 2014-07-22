package co.kr.hapoida.chapter07.builder;

public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitle("Greting");
		builder.makeString("��ħ�� ����");
		builder.makeItems(new String[]{
				"���� ��ħ�Դϴ�.",
				"�ȳ��ϼ���"
		});
		builder.makeString("�㿡");
		builder.makeItems(new String[]{
				"�ȳ��ϼ���",
				"�ȳ����ֹ�����",
				"�ȳ��� �Լ���"
		});
		builder.close();
	}
}