package co.kr.hapoida.chapter05.singleton;

public class TicketMaker {
	
	private static TicketMaker ticketMaker = new TicketMaker();
	
	private int ticket = 1000;
	public int getNextTicketNumber(){
		return ticket++;
	}
	
	private TicketMaker() {}
	
	public static TicketMaker getInstance(){
		if(ticketMaker == null){
			synchronized (ticketMaker) {
				return new TicketMaker();
			}
		} else {
			return ticketMaker;
		}
		
	}
	
}
