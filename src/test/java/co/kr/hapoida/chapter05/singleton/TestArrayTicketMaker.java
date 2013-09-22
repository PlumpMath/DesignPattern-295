package co.kr.hapoida.chapter05.singleton;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.hamcrest.core.IsNot.not;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestArrayTicketMaker {
	
	@Test
	public void test_TicketMaker(){
		TestArrayTicketMaker ticketMaker0 = ArrayTicketMaker.getInstance(0);
		TestArrayTicketMaker ticketMaker1 = ArrayTicketMaker.getInstance(1);
		TestArrayTicketMaker ticketMaker2 = ArrayTicketMaker.getInstance(2);

		assertThat(ticketMaker0 , not(ticketMaker1));
		assertThat(ticketMaker0 , not(ticketMaker2));
		assertThat(ticketMaker1 , not(ticketMaker2));
	}
}
