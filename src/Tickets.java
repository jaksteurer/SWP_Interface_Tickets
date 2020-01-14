
public interface Tickets {
	
	public String veranstaltungsort = " ";
	public String veranstaltungsname =" ";
	public double basispreis = 0;
	public double ticketpreis = 0;  
	
	abstract double berechneTicketpreis();
	
	public default double getbasispreis() {
		return basispreis;
	}
//	public default void ausgabe() {
//		System.out.println("Veranstaltungsname: "+veranstaltungsname);
//		System.out.println("Veranstaltungsort: "+veranstaltungsort);
//		System.out.println("Preis pro Ticket: "+berechneTicketpreis()+" €");
//	}
}
