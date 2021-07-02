package com.onlineReservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")
public class BusModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="bus_name")
	private String busName;
	@Column(name="start_city")
	private String startCity;
	@Column(name="destination_city")
	private String destinationCity;
	@Column(name="booked_seat")
	private String bookedSeat;
	@Column(name="starting_time")
	private String startingTime;
	@Column(name="day")
	private String day;
	
	
	public BusModel() {
		
	}


	public BusModel( String busName, String startCity, String destinationCity, String bookedSeat, String startingTime, String day) {
		this.busName=busName;
		this.startCity = startCity;
		this.destinationCity = destinationCity;
		this.bookedSeat = bookedSeat;
		this.startingTime = startingTime;
		this.day = day;
	}


	public int getId() {
		return id;
	}


	public String getStartCity() {
		return startCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public String getBookedSeat() {
		return bookedSeat;
	}


	public String getStartingTime() {
		return startingTime;
	}


	public String getDay() {
		return day;
	}
	
	public String getBusName() {
		return busName;
	}
	
	public String setbookedSeat(String s){
		bookedSeat=bookedSeat+" "+s;
		return bookedSeat;
		
	}
	
	
	
	
	
	
	

}
