package com.onlineReservation.model;


import javax.persistence.*;


@Entity
@Table(name="Booking")
public class BookingModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;	
	@Column(name="seats")
	private String seats;
	@Column(name="journey_date")
	private String date;
	@Column(name="journey_from")
	private String from;
	@Column(name="journey_to")
	private String to;
	@Column(name="price")
	private String price;
	@Column(name="bus_id")
	private String busID;
	@Column(name="user_id")
	private String userId;
	
	
	public BookingModel()
	{
		
	}


	public BookingModel(String seats, String date, String from, String to, String price, String busName, String email) {
		
		this.seats = seats;
		this.date = date;
		this.from = from;
		this.to = to;
		this.price = price;
		this.busID = busName;
		this.userId = email;
	}


	public int getId() {
		return id;
	}

	public String getSeats() {
		return seats;
	}


	public void setSeats(String seats) {
		this.seats = seats;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getBusID() {
		return busID;
	}


	public void setBusID(String busID) {
		this.busID = busID;
	}
	
	
	
	
	
	
	
	
	

}
