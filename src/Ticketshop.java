import java.util.ArrayList;

public class Ticketshop {

	static ArrayList<Tickets> Liste = new ArrayList<Tickets>();
	
	public static void main(String[] args) {
		
//		new SubSportticket("Tennis","Monaco",350);
//		new SubKonzertticket("Rock'n Roll","Dogana Innsbruck",20.99);
//		new SubTheaterticket("Der eiserne Mann","Landestheater Innsbruck",24.99);
	}

	public void bestellen(Tickets t)
	{
		Liste.add(t);
	}
	public int getAnzahlTickets()
	{
		return Liste.size();
	}
	
	public double g�nstigstesTicket()
	{
		double g�nstigstes = 1000.0;
		for(int i=0;i<Liste.size();i++)
		{
			if(Liste.get(i).ticketpreis<g�nstigstes)
			{
				g�nstigstes = Liste.get(i).ticketpreis;
			}
		}
		return g�nstigstes;
	}
	
	public double teuerstesTicket()
	{
		double teuerstes = 0.0;
		for(int i=0;i<Liste.size();i++)
		{
			if(Liste.get(i).ticketpreis>teuerstes)
			{
				teuerstes = Liste.get(i).ticketpreis;
			}
		}
		return teuerstes;
	}
}
