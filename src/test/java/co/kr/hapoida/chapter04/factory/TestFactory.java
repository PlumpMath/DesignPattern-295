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
	public void test_���丮����(){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("�̼���");
		Product card3 = factory.create("������");
		assertThat(card1.use() , is("ȫ�浿�� ī�带 ����մϴ�."));
		assertThat(card2.use() , is("�̼����� ī�带 ����մϴ�."));
		assertThat(card3.use() , is("�������� ī�带 ����մϴ�."));
	}
}
