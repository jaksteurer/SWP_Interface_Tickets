
public interface Tickets {
	
	void setVeranstaltungsort(String vort);
	String getVeranstaltungsort();
	
	void setVeranstaltungsname (String vname);
	String getVeranstaltungsname();
	
	void setBasispreis(double bpreis);
	double getBasispreis();
	
	void setTicketpreis (double tpreis);
	double getTicketpreis();
	
	void ausgabe();

}
