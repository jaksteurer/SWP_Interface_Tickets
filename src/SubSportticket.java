
public class SubSportticket implements Tickets{
	
	private final int KOSTEN = 3000;
	private final int TICKETS = 7000;
	private final int SPIELERKOSTEN = 2500;

	public void ausgabe() {
		//System.out.println("\n-------------------------------------");
		System.out.println("--------------Sportticket--------------");
		System.out.println("Veranstaltung: "+this.veranstaltungsname);
		System.out.println("Veranstaltungsort: "+this.veranstaltungsort);
		System.out.println("Preis pro Ticket: "+ticketpreis+"€");
	}
	
	double basispreis = getbasispreis()+KOSTEN+SPIELERKOSTEN;
	
	public double berechneTicketpreis() {
		this.ticketpreis = basispreis/TICKETS;
		return ticketpreis;
	}
	
}

