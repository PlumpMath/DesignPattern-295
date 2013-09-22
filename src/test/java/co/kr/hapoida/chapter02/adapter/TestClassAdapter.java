package co.kr.hapoida.chapter02.adapter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter02.adapter.clas.Print;
import co.kr.hapoida.chapter02.adapter.clas.PrintBanner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestClassAdapter {
	@Test
	public void test_어뎁터프린트(){
		
		String TestString = "Hello";
		
		Print p = new PrintBanner(TestString);
		assertThat(p.printWeak() , is("(" + TestString + ")"));
		assertThat(p.printStrong() , is("*" + TestString + "*"));
		
	}
}
