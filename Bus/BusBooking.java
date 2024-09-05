package Bus;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BusBooking {
	String passengerName;
	int busNo;
	Date date;
	private int booked;
	
	BusBooking(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus No :");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-MM-yyy :");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy ");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<BusBooking> bookings, ArrayList<Bus> buses) {
		// TODO Auto-generated method stub
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo()== busNo)
				capacity = bus.getCapacity();
		}
		for(BusBooking b:bookings) {
			if(b.busNo == busNo &&date.equals(date)) {
				booked++;
			}
			
		}
		return booked<capacity?true:false;
	}

}
