package co.kr.hapoida.chapter05.singleton;

public class ArrayTicketMaker {
	
	private static TestArrayTicketMaker[] ticketMaker = new TestArrayTicketMaker[3];
	
	private static int index = 0;
	private int ticket = 1000;
	public int getNextTicketNumber(){
		return ticket++;
	}
	
	private ArrayTicketMaker() {}
	
	public static TestArrayTicketMaker getInstance(int reqIndex){
		if(index < 3 && ticketMaker[reqIndex] == null){
			synchronized (ticketMaker) {
				ticketMaker[reqIndex] = new TestArrayTicketMaker();
				return ticketMaker[reqIndex];
			}
		} else {
			return ticketMaker[reqIndex];
		}
	}
}
