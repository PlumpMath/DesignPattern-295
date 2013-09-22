package co.kr.hapoida.chapter04.factory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter04.factory.framework.Factory;
import co.kr.hapoida.chapter04.factory.framework.Product;
import co.kr.hapoida.chapter04.factory.idcard.IDCardFactory;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestFactory {
	
	@Test
	public void test_팩토리패턴(){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		assertThat(card1.use() , is("홍길동의 카드를 사용합니다."));
		assertThat(card2.use() , is("이순신의 카드를 사용합니다."));
		assertThat(card3.use() , is("강감찬의 카드를 사용합니다."));
	}
}
