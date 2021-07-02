package com.onlineReservation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineReservation.model.BusModel;
import com.onlineReservation.repository.BusRepo;

@Service
public class BusService {
	
	@Autowired
	BusRepo busRepo;
	
	public String AddBus(String busName, String startCity, String destinationCity, String bookedSeat, String startingTime, String day)
	{
		BusModel bus=new BusModel(busName, startCity, destinationCity, bookedSeat, startingTime, day);
		
		if(bus!=null)
		{
			busRepo.save(bus);
			System.out.println("New Bus Added Successfully");
			return "Successfull";
		}
		else
		{
			System.out.println("Not Able to Add New Bus");
			return "Unsuccessfull";
		}
	}
	
	public List<String> getAllBusNameByLocation(String start,String Dest)
	{
		List<String> al=new ArrayList<String>();
		System.out.println(start);
		List<BusModel> bus=busRepo.findByStartCity(start);
		System.out.println(bus.size()+" bus repo details");
		for(int i=0;i<bus.size();i++)
		{
			if(bus.get(i).getDestinationCity().equalsIgnoreCase(Dest))
			{
				al.add(bus.get(i).getBusName());
			}
			else
			{
				
				System.out.println("Not Same");
			}
		}
		
		return al;
		
	}
	
	public String getBookedSeat(String busName)
	{
		
		String bookedSeat[]=busRepo.findByBusName(busName).getBookedSeat().split(" ");
		String desiredSeat="";
		for(String s:bookedSeat)
		{
			desiredSeat=desiredSeat+" "+s;
		}
	
		return desiredSeat;
	}
	

}
