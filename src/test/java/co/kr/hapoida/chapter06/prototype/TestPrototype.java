package co.kr.hapoida.chapter06.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter06.prototype.anonymous.MessageBox;
import co.kr.hapoida.chapter06.prototype.anonymous.UnderlinePan;
import co.kr.hapoida.chapter06.prototype.framwork.Manager;
import co.kr.hapoida.chapter06.prototype.framwork.Product;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestPrototype {
	
	@Test
	public void test_프로토타입(){
		Manager 		manager = new Manager();
		UnderlinePan 	upPan 	= new UnderlinePan('~');
		MessageBox 		mbox	= new MessageBox('*');
		MessageBox		sbox	= new MessageBox('/');
		
		manager.register("strong message", upPan);
		manager.register("warning box"	, mbox);
		manager.register("slash box"	, sbox);
		
		Product p1 = manager.create("strong message");
		p1.use("Hello, world");
		
		Product p2 = manager.create("warning box");
		p2.use("Hello, world");
		
		Product p3 = manager.create("slash box");
		p3.use("Hello, world");
	}
}
