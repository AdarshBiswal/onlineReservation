package com.onlineReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineReservation.model.BookingModel;
import com.onlineReservation.model.BusModel;
import com.onlineReservation.repository.BookingRepo;
import com.onlineReservation.repository.BusRepo;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;
	
	@Autowired
	BusRepo busRepo;

	public  String updateBusDetails(String busName,String seat) {
		// TODO Auto-generated method stub
		
		BusModel bus=busRepo.findByBusName(busName);
		String s=bus.setbookedSeat(seat);
		busRepo.save(bus);
		
		return "Updated Bus";
		
	}

	public String addBooking(String email, String fromCity, String toCity, String jDate, String busName,
			String finalPrice, String selectedSeat) {
		// TODO Auto-generated method stub
		
		BookingModel bookingModel=new BookingModel(selectedSeat, jDate, fromCity, toCity, finalPrice, busName, email);
		bookingRepo.save(bookingModel);
		
		
		
		return "Successfull";
		
	}
	
	
	
	

}
