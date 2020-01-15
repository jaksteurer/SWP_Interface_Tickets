
public class SubSportticket extends Ticket_Main implements Tickets{
	
	private final int KOSTEN = 3000;
	private final int TICKETS = 7000;
	private final int SPIELERKOSTEN = 2500;
	private double ticketpreis;
	private String veranstaltungsname;
	private String veranstaltungsort;
	private double basispreis;

	public SubSportticket(String eventLocation, String eventName, double t_preis) {
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
		basispreis = KOSTEN+SPIELERKOSTEN;
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
		System.out.println("----------Sportticket----------");
		System.out.println("Veranstaltungsort: "+veranstaltungsort);
		System.out.println("Veranstaltungsname: "+veranstaltungsname);
		System.out.println("Ticketpreis: "+ticketpreis+"\n");
		
	}
}

