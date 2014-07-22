package co.kr.hapoida.chapter08.abstractFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.hapoida.chapter08.abstractFactory.factory.Factory;
import co.kr.hapoida.chapter08.abstractFactory.factory.Link;
import co.kr.hapoida.chapter08.abstractFactory.factory.Page;
import co.kr.hapoida.chapter08.abstractFactory.factory.Tray;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAbstractFactory {
	
	@Test
	public void test_abstractFactory_listFactory(){
		
		String classname = "co.kr.hapoida.chapter08.abstractFactory.listfactory.ListFactory";
		
		Factory factory = Factory.getFactory(classname);
		
		Link joins    = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun   = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
		Link excite   = factory.createLink("Excite", "http://www.excite.com/");
		Link google   = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traySearch = factory.createTray("검색앤진");
		traySearch.add(trayyahoo);
		traySearch.add(excite);
		traySearch.add(google);
		
		Page page = factory.createPage("LinkPage", "영진닷컴");
		page.add(traynews);
		page.add(traySearch);
		page.output();
	}
	
	@Test
	public void test_abstractFactory_tableFactory(){
		
		String classname = "co.kr.hapoida.chapter08.abstractFactory.tablefactory.TableFactory";
		
		Factory factory = Factory.getFactory(classname);
		
		Link joins    = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun   = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
		Link excite   = factory.createLink("Excite", "http://www.excite.com/");
		Link google   = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traySearch = factory.createTray("검색앤진");
		traySearch.add(trayyahoo);
		traySearch.add(excite);
		traySearch.add(google);
		
		Page page = factory.createPage("LinkPage", "영진닷컴");
		page.add(traynews);
		page.add(traySearch);
		page.output();
	}
}
