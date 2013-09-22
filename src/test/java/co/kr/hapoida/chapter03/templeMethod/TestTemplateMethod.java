package co.kr.hapoida.chapter03.templeMethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter03.templeteMethod.AbstractDisplay;
import co.kr.hapoida.chapter03.templeteMethod.CharDisplay;
import co.kr.hapoida.chapter03.templeteMethod.StringDisplay;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTemplateMethod {
	
	@Test
	public void testt_템플릿메소드(){
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world");
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		
		d1.display();
		d2.display();
		d3.display();
	}
}
