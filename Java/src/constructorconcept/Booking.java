package constructorconcept;

import java.util.ArrayList;

public class Booking {
	String stPlace;
	String endPlace;
	String carType;
	ArrayList<Integer> bookingList;

	public Booking(String stPlace, String endPlace, String carType, ArrayList<Integer> bookingList) {
		this.stPlace = stPlace;
		this.endPlace = endPlace;
		this.carType = carType;
		this.bookingList = bookingList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> bkList = new ArrayList<Integer>();
		bkList.add(101);
		bkList.add(102);
		bkList.add(103);
		Booking bk = new Booking("Tandalja", "Akota", "Sedan", bkList);
		System.out.println(bk.stPlace + " " + bk.endPlace + " " + bk.carType + " " + bk.bookingList);
	}
}
