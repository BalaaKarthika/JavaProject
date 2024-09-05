package Bus;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<BusBooking> bookings = new ArrayList<BusBooking>();
		
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int userOpt = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while(userOpt == 1) {
		System.out.println("Enter 1 to Book and 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt == 1) {
			BusBooking booking = new BusBooking();
			//System.out.println("Booking..");
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
				
			}
			else 
				System.out.println("sorry, bus is full. Try another bus or date ");
				
			}
		}
	  }		
    }
