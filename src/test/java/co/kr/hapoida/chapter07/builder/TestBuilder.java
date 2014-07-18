package co.kr.hapoida.chapter07.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBuilder {
	
	@Test
	public void test_���������׽�Ʈ_�Ϲ���(){
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.construct();
		String result = textBuilder.getResult();
		System.out.println(result);
	}
	
	@Test
	public void test_���������׽�Ʈ_html(){
		HtmlBuilder htmlBuilder = new HtmlBuilder();
		Director director = new Director(htmlBuilder);
		director.construct();
		String fileName = htmlBuilder.getResult();
		System.out.println(fileName + "�� �ۼ��Ǿ����ϴ�.");
	}

}

