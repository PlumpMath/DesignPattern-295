package co.kr.hapoida.chapter05.singleton;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTicketMaker {
	
	@Test
	public void test_TicketMaker(){
		TicketMaker ticketMaker = TicketMaker.getInstance();
		TicketMaker subTicketMaker = TicketMaker.getInstance();
		
		assertThat(ticketMaker , is(subTicketMaker));
	}
}
