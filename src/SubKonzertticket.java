
public class SubKonzertticket extends Ticket_Main implements Tickets {
	
	private final int KOSTEN = 4000;
	private final int MUSIKERKOSTEN = 3000;
	private final int TICKETS = 5000;
	private double ticketpreis;
	private String veranstaltungsname;
	private String veranstaltungsort;
	private double basispreis;

	public SubKonzertticket(String eventLocation, String eventName, double t_preis) {
		setVeranstaltungsort(eventLocation);
		setVeranstaltungsname(eventName);
		setTicketpreis(t_preis);
	}
	@Override
	public void setVeranstaltungsort(String vort) {
		veranstaltungsort = vort;		
	}

	@Override
	public String getVeranstaltungsort() {
		return veranstaltungsort;
	}

	@Override
	public void setVeranstaltungsname(String vname) {
		veranstaltungsname = vname;
	}

	@Override
	public String getVeranstaltungsname() {
		return veranstaltungsname;
	}

	@Override
	public void setBasispreis(double bpreis) {
		basispreis = KOSTEN+MUSIKERKOSTEN;
		basispreis = bpreis;
	}

	@Override
	public double getBasispreis() {
		return basispreis;
	}

	@Override
	public void setTicketpreis(double tpreis) {
		ticketpreis = basispreis/TICKETS;
		ticketpreis = tpreis;
	}

	@Override
	public double getTicketpreis() {
		return ticketpreis;
	}

	@Override
	public void ausgabe() {
		System.out.println("----------Konzertticket----------");
		System.out.println("Veranstaltungsort: "+veranstaltungsort);
		System.out.println("Veranstaltungsname: "+veranstaltungsname);
		System.out.println("Ticketpreis: "+ticketpreis+"\n");
		
	}
}