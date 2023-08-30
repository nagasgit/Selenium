package mandatoryCW.restAssured;

public class PojoGetResBookingIds {
	
	private int bookingid;
	
	public PojoGetResBookingIds()
	{
		
	}
	
	//Parameterized Contructor
	public PojoGetResBookingIds(int bookingid) {
		
		this.bookingid = bookingid;
	}

	public int getBookingid() {
		return bookingid;
	}
	
	
	

}
