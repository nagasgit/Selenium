package mandatoryCW.restAssured;

public class PojoBookingDates {

	private String checkin;
	private String checkout;
	
	public PojoBookingDates(String checkin, String checkout) {
		
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public String getCheckin() {
		return checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public PojoBookingDates() {
		
	}
	
	
	
	
}
