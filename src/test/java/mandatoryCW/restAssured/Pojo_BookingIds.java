package mandatoryCW.restAssured;

public class Pojo_BookingIds {

	private int bookingid;
	private Pojo_CreateBooking booking;

	public Pojo_BookingIds(int bookingid, Pojo_CreateBooking booking) {
		this.bookingid = bookingid;
		this.booking = booking;
	}

	public int getBookingid() {
		return bookingid;
	}

	public Pojo_CreateBooking getBooking() {
		return booking;
	}

	public Pojo_BookingIds() {
	
	}
		
}
