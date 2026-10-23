package com.nit.exceptionhandling;
class RoomUnavailableException extends Exception{
	public RoomUnavailableException(String message) {
        super(message);
    }
}
class InvalidBookingException extends Exception{
	public InvalidBookingException(String message) {
        super(message);
    }
}

interface BookingOperations{
	public void bookRoom();
	public void cancelBooking();
}
abstract class Room implements BookingOperations{
	protected int nights;

	public Room(int nights) {
		super();
		this.nights = nights;
	}

	public int getNights() {
		return nights;
	}
	
}
class StandardRoom extends Room{
	public StandardRoom(int nights) {
		super(nights);
		
	}
	@Override
	public void bookRoom() {
	
	}
	@Override
	public void cancelBooking() {}
}
class DeluxeRoom extends Room{
	public DeluxeRoom(int nights) {
		super(nights);
		
	}
	@Override
	public void bookRoom() {
		
		
	}
	@Override
	public void cancelBooking() {}
}

public class HotelRoomBooking {
	
}