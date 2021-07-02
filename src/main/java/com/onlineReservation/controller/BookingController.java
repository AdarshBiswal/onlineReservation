package com.onlineReservation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onlineReservation.model.BookingModel;
import com.onlineReservation.model.BusModel;
import com.onlineReservation.model.UserModel;
import com.onlineReservation.repository.BookingRepo;
import com.onlineReservation.repository.BusRepo;
import com.onlineReservation.repository.UserRepo;
import com.onlineReservation.service.BookingService;

@RestController
@RequestMapping(path="/booking")
public class BookingController {
	
	@Autowired
	BookingService bookingSerivce;
	@Autowired
	UserRepo userRepo;
	@Autowired
	BusRepo busRepo;
	
	/*
	 * @GetMapping("/allBookingDetails") public List<BookingModel> getAllBooking() {
	 * 
	 * return bookingRepo.findAll();
	 * 
	 * }
	 * 
	 * @GetMapping("/BookingDetails/{id}") public BookingModel
	 * getBooking(@PathVariable("id") int id) { return bookingRepo.findById(id); }
	 * 
	 */
	
	@PostMapping("/addBookingInformation")
	public ModelAndView addBookingInformation(
			@Param("email") String email,
			@Param("fromCity") String fromCity,
			@Param("toCity") String toCity,
			@Param("JDate") String JDate,
			@Param("busName") String busName,
			@Param("finalPrice") String finalPrice,
			@Param("selectedSeat") String selectedSeat,ModelAndView mv)
	{
		
		System.out.println(email);
		System.out.println(fromCity);
		System.out.println(toCity);
		System.out.println(JDate);
		System.out.println(busName);
		System.out.println(finalPrice);
		System.out.println(selectedSeat);
		
		//Updated Bus Seat
		String s=bookingSerivce.updateBusDetails(busName, selectedSeat);
		
		//Add Booking
		bookingSerivce.addBooking(email,fromCity,toCity,JDate,busName,finalPrice,selectedSeat);
		
		 mv.addObject("JDate",JDate);
		  mv.addObject("email",email);
		  mv.addObject("fromCity",fromCity);
		  mv.addObject("toCity",toCity);
		  mv.addObject("busName",busName);
		  mv.addObject("selectedSeat",selectedSeat);
		  mv.addObject("finalPrice",finalPrice);
		  
		  UserModel um=userRepo.findByEmail(email);
		  BusModel bm=busRepo.findByBusName(busName);
		  mv.addObject("firstName",um.getFirstName());
		  mv.addObject("lastName",um.getLastName());
		  mv.addObject("mobile",um.getMobile());
		  mv.addObject("busTime",bm.getStartingTime());
		  
		
		mv.setViewName("finalBooking");
		return mv;
		
	}
			
	/*
	 * @PostMapping("/addBooking") public void addBooking(@Param("seat") String
	 * seat,@Param("uid") String uid,@Param("bid")String bid) {
	 * 
	 * UserModel user=ur.findById(Integer.parseInt(uid)); BusModel
	 * bus=br.findById(Integer.parseInt(bid)); BookingModel bm=new
	 * BookingModel(seat,user.getId(),bus.getId()); bookingRepo.save(bm);
	 * 
	 * }
	 */
	@PostMapping("/payment")
	public ModelAndView Payment(
			
			@Param("seat1") String seat1,
			@Param("seat2") String seat2,
			@Param("seat3") String seat3,
			@Param("seat4") String seat4,
			@Param("seat5") String seat5,
			@Param("seat6") String seat6,
			@Param("seat7") String seat7,
			@Param("seat8") String seat8,
			@Param("seat9") String seat9,
			@Param("seat10") String seat10,
			@Param("seat11") String seat11,
			@Param("seat12") String seat12,
			@Param("seat13") String seat13,
			@Param("seat14") String seat14,
			@Param("seat15") String seat15,
			@Param("seat16") String seat16,
			@Param("seat17") String seat17,
			@Param("seat18") String seat18,
			@Param("seat19") String seat19,
			@Param("seat20") String seat20,
			@Param("seat21") String seat21,
			@Param("seat22") String seat22,
			@Param("seat23") String seat23,
			@Param("seat24") String seat24,
			@Param("seat25") String seat25,
			@Param("seat26") String seat26,
			@Param("seat27") String seat27,
			@Param("seat28") String seat28,
			@Param("seat29") String seat29,
			@Param("seat30") String seat30,
			@Param("seat31") String seat31,
			@Param("seat32") String seat32,
			@Param("seat33") String seat33,
			@Param("seat34") String seat34,
			@Param("seat35") String seat35,
			@Param("seat36") String seat36,
			@Param("email") String email,
			@Param("toCity") String toCity,
			@Param("fromCity") String fromCity,
			@Param("JDate") String JDate,
			@Param("busName") String busName,
			ModelAndView mv)
	{
		
		
		System.out.println(JDate);
		/*
		 * if(seat1==null && seat2==null && seat3==null && seat4==null && seat5==null &&
		 * seat6==null && seat7==null && seat8==null && seat9==null && seat10==null &&
		 * seat11==null && seat12==null && seat13==null && seat14==null && seat15==null
		 * && seat16==null && seat17==null && seat18==null && seat19==null &&
		 * seat20==null && seat21==null && seat22==null && seat23==null && seat24==null
		 * && seat25==null && seat26==null && seat27==null && seat28==null &&
		 * seat29==null && seat30==null && seat31==null && seat32==null && seat33==null
		 * && seat34==null && seat35==null && seat36==null) {
		 * 
		 * 
		 * bc.getAvailableSeat() mv.addObject("message", "Please select seat"); return
		 * mv; }
		 */
		
		String selectedSeat="";
		if(seat1!=null)
		{
			selectedSeat=selectedSeat+" "+1;
		}
		if(seat2!=null)
		{
			selectedSeat=selectedSeat+" "+2;
		}
		if(seat3!=null)
		{
			selectedSeat=selectedSeat+" "+3;
		}
		if(seat4!=null)
		{
			selectedSeat=selectedSeat+" "+4;
		}
		if(seat5!=null)
		{
			selectedSeat=selectedSeat+" "+5;
		}
		if(seat6!=null)
		{
			selectedSeat=selectedSeat+" "+6;
		}
		if(seat7!=null)
		{
			selectedSeat=selectedSeat+" "+7;
		}
		if(seat8!=null)
		{
			selectedSeat=selectedSeat+" "+8;
		}
		if(seat9!=null)
		{
			selectedSeat=selectedSeat+" "+9;
		}
		if(seat10!=null)
		{
			selectedSeat=selectedSeat+" "+10;
		}
		if(seat11!=null)
		{
			selectedSeat=selectedSeat+" "+11;
		}
		if(seat12!=null)
		{
			selectedSeat=selectedSeat+" "+12;
		}
		if(seat13!=null)
		{
			selectedSeat=selectedSeat+" "+13;
		}
		if(seat14!=null)
		{
			selectedSeat=selectedSeat+" "+14;
		}
		if(seat15!=null)
		{
			selectedSeat=selectedSeat+" "+15;
		}
		if(seat16!=null)
		{
			selectedSeat=selectedSeat+" "+16;
		}
		if(seat17!=null)
		{
			selectedSeat=selectedSeat+" "+17;
		}
		if(seat18!=null)
		{
			selectedSeat=selectedSeat+" "+18;
		}
		if(seat19!=null)
		{
			selectedSeat=selectedSeat+" "+19;
		}
		if(seat20!=null)
		{
			selectedSeat=selectedSeat+" "+20;
		}
		if(seat21!=null)
		{
			selectedSeat=selectedSeat+" "+21;
		}
		if(seat22!=null)
		{
			selectedSeat=selectedSeat+" "+22;
		}
		if(seat23!=null)
		{
			selectedSeat=selectedSeat+" "+23;
		}
		if(seat24!=null)
		{
			selectedSeat=selectedSeat+" "+24;
		}
		if(seat25!=null)
		{
			selectedSeat=selectedSeat+" "+25;
		}
		if(seat26!=null)
		{
			selectedSeat=selectedSeat+" "+26;
		}
		if(seat27!=null)
		{
			selectedSeat=selectedSeat+" "+27;
		}
		if(seat28!=null)
		{
			selectedSeat=selectedSeat+" "+28;
		}
		if(seat29!=null)
		{
			selectedSeat=selectedSeat+" "+29;
		}
		if(seat30!=null)
		{
			selectedSeat=selectedSeat+" "+30;
		}
		if(seat31!=null)
		{
			selectedSeat=selectedSeat+" "+31;
		}
		if(seat32!=null)
		{
			selectedSeat=selectedSeat+" "+32;
		}
		if(seat33!=null)
		{
			selectedSeat=selectedSeat+" "+33;
		}
		if(seat34!=null)
		{
			selectedSeat=selectedSeat+" "+34;
		}
		if(seat35!=null)
		{
			selectedSeat=selectedSeat+" "+35;
		}
		if(seat36!=null)
		{
			selectedSeat=selectedSeat+" "+36;
		}
		
		
		System.out.println(selectedSeat);
		String selectedSeat1=selectedSeat.trim();
		
		  String s[]=selectedSeat1.split(" ");
		  int price=s.length*950;
		  String finalPrice=price+""+".00";
		  mv.addObject("JDate",JDate);
		  mv.addObject("email",email);
		  mv.addObject("fromCity",fromCity);
		  mv.addObject("toCity",toCity);
		  mv.addObject("busName",busName);
		  mv.addObject("selectedSeat",selectedSeat1);
		  mv.addObject("finalPrice",finalPrice);
		  System.out.println(JDate);
		//bookingService.updateBus(); 
		mv.setViewName("payment");
		return mv;
	}
	
	/*
	 * @PostMapping("/booking/addDetails") public ModelAndView
	 * saveBookingPageParameter(@Param("fromCity") String fromCity,@Param("toCity")
	 * String toCity ,@Param("JDate") String jDate,@Param("rDate") String
	 * rDate,@Param("emal") String email,ModelAndView mv) { mv.addObject("fromCity",
	 * fromCity); mv.addObject("toCity", toCity); mv.addObject("jDate", jDate);
	 * mv.addObject("rDate", rDate); mv.addObject("email",email);
	 * mv.setViewName("busList"); return mv;
	 * 
	 * 
	 * 
	 * }
	 */
	

}
