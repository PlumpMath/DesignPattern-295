package co.kr.hapoida.chapter07.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBuilder {
	
	@Test
	public void test_빞드패턴테스트_일반평문(){
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.construct();
		String result = textBuilder.getResult();
		System.out.println(result);
	}
	
	@Test
	public void test_빞드패턴테스트_html(){
		HtmlBuilder htmlBuilder = new HtmlBuilder();
		Director director = new Director(htmlBuilder);
		director.construct();
		String fileName = htmlBuilder.getResult();
		System.out.println(fileName + "가 작성되었습니다.");
	}

}

