
public class SubKonzertticket implements Tickets {
	
	private final int KOSTEN = 4000;
	private final int MUSIKERKOSTEN = 3000;
	private final int TICKETS = 5000;
	
	public void ausgabe() {
		//System.out.println("\n---------------------------------------");
		System.out.println("\n-------------Konzertticket-------------");
		System.out.println("Veranstaltung: "+this.veranstaltungsname);
		System.out.println("Veranstaltungsort: "+this.veranstaltungsort);
		System.out.println("Preis pro Ticket: "+ticketpreis+"€");	
	}
	double basispreis = getbasispreis()+KOSTEN+MUSIKERKOSTEN;

	public double berechneTicketpreis() {
		this.ticketpreis = basispreis/TICKETS;
		return ticketpreis;
	}
}