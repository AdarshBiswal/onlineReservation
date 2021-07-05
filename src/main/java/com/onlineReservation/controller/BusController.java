package com.onlineReservation.controller;

import java.util.HashMap;
import java.util.List;

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
import com.onlineReservation.service.BusService;
import com.onlineReservation.service.UserService;

@RestController
@RequestMapping(path="/bus")
public class BusController {

	@Autowired
	BusService busService;
	@Autowired
	BookingRepo bookingRepo ;
	
	
	
	
	@GetMapping("/availableBus")
	public ModelAndView getAvailbleBus(ModelAndView mv)
	{
		List<BusModel> bm=busService.getAllBusList();
		mv.addObject("busList",bm);
		mv.setViewName("availableBusList");
		return mv;
	}
	
	@PostMapping("/allBusDetailsByLocation")
	public ModelAndView getAllBus(@Param("fromCity") String fromCity,@Param("toCity") String toCity, @Param("JDate") String JDate, @Param("email") String email  , ModelAndView mv)
	{
		    
		
		    System.out.println("Moving to BusList With Values");
			System.out.println("Now in bus details");
			System.out.println(email);
			System.out.println(JDate);
			System.out.println(fromCity);
			System.out.println(toCity);
			System.out.println(JDate);
			List<String> al=busService.getAllBusNameByLocation(fromCity,toCity );
			System.out.println(al.size());
			if(al.size()>0)
			{
				mv.addObject("busList", al);
				mv.addObject("startCity",fromCity);
				mv.addObject("destCity", toCity);
				mv.addObject("email",email);
				mv.addObject("JDate",JDate);
				mv.addObject("message","success");
				mv.setViewName("busList");
				return mv;
			}
			else
			{
				mv.addObject("message","Unsuccess");
				mv.setViewName("reserve");
				return mv;
			}
		
	}
	
	/*
	 * @GetMapping("/busDetails/{id}") public BusModel getBus(@PathVariable("id")
	 * int id) { return busRepo.findById(id); }
	 * 
	 */
	  @PostMapping("/addBus") 
	  public ModelAndView addBus(@Param("busName") String busName,@Param("startCity") String startCity,@Param("destinationCity") String destinationCity,@Param("bookedSeat") String bookedSeat ,@Param("startingTime") String startingTime,@Param("day") String day,ModelAndView mv)
	  {
		  
		  System.out.println(busName);
		  String s=busService.AddBus(busName, startCity, destinationCity, bookedSeat, startingTime, day);
		  mv.setViewName("adminManagePage");
			 return mv;
	  }
	  
	  @PostMapping("/selectSeat")
	  public ModelAndView getAvailableSeat(@Param("fromCity")String fromCity,@Param("toCity")String toCity,@Param("fromCity")String busName,@Param("email")String email,@Param("JDate")String JDate, ModelAndView mv)
	  {
		  
		  System.out.println(busName);
		  System.out.println(JDate);
		  System.out.println(fromCity);
		  System.out.println(toCity);
		  System.out.println(email);
		  
		  List<BookingModel> bm=bookingRepo.findByBusIDAndDate(busName,JDate);
		  HashMap<Integer,String> hm;
		  
		  if(bm!=null)
		  {   String bookedSeatByUser="";
			  for(BookingModel b:bm)
			  {
				  bookedSeatByUser=bookedSeatByUser+" "+ b.getSeats();
			  }
			  String allBookSeat=bookedSeatByUser.trim();
			  hm=new HashMap<Integer,String>();
			  String bookedSeat[]=allBookSeat.split(" ");
			  hm.put(1, "N");
			  hm.put(2, "N");
			  hm.put(3, "N");
			  hm.put(4, "N");
			  hm.put(5, "N");
			  hm.put(6, "N");
			  hm.put(7, "N");
			  hm.put(8, "N");
			  hm.put(9, "N");
			  hm.put(10, "N");
			  hm.put(11, "N");
			  hm.put(12, "N");
			  hm.put(13, "N");
			  hm.put(14, "N");
			  hm.put(15, "N");
			  hm.put(16, "N");
			  hm.put(17, "N");
			  hm.put(18, "N");
			  hm.put(19, "N");
			  hm.put(20, "N");
			  hm.put(21, "N");
			  hm.put(22, "N");
			  hm.put(23, "N");
			  hm.put(24, "N");
			  hm.put(25, "N");
			  hm.put(26, "N");
			  hm.put(27, "N");
			  hm.put(28, "N");
			  hm.put(29, "N");
			  hm.put(30, "N");
			  hm.put(31, "N");
			  hm.put(32, "N");
			  hm.put(33, "N");
			  hm.put(34, "N");
			  hm.put(35, "N");
			  hm.put(36, "N");
			  
			  System.out.println(bookedSeat);
			  for(int i=0;i<bookedSeat.length;i++)
			  {
				  System.out.println(bookedSeat);
				  
				  if(bookedSeat[i].equals(""))
				  {
					  continue;
				  }
				  hm.put(Integer.parseInt(bookedSeat[i]),"Y");
			  }
			  
			  
			  mv.addObject("s1", hm.get(1));
			  mv.addObject("s2", hm.get(2));
			  mv.addObject("s3", hm.get(3));
			  mv.addObject("s4", hm.get(4));
			  mv.addObject("s5", hm.get(5));
			  mv.addObject("s6", hm.get(5));
			  mv.addObject("s7", hm.get(7));
			  mv.addObject("s8", hm.get(8));
			  mv.addObject("s9", hm.get(9));
			  mv.addObject("s10", hm.get(10));
			  mv.addObject("s11", hm.get(11));
			  mv.addObject("s12", hm.get(12));
			  mv.addObject("s13", hm.get(13));
			  mv.addObject("s14", hm.get(14));
			  mv.addObject("s15", hm.get(15));
			  mv.addObject("s16", hm.get(16));
			  mv.addObject("s17", hm.get(17));
			  mv.addObject("s18", hm.get(18));
			  mv.addObject("s19", hm.get(19));
			  mv.addObject("s20", hm.get(20));
			  mv.addObject("s21", hm.get(21));
			  mv.addObject("s22", hm.get(22));
			  mv.addObject("s23", hm.get(23));
			  mv.addObject("s24", hm.get(24));
			  mv.addObject("s25", hm.get(25));
			  mv.addObject("s26", hm.get(26));
			  mv.addObject("s27", hm.get(27));
			  mv.addObject("s28", hm.get(28));
			  mv.addObject("s29", hm.get(29));
			  mv.addObject("s30", hm.get(30));
			  mv.addObject("s31", hm.get(31));
			  mv.addObject("s32", hm.get(32));
			  mv.addObject("s33", hm.get(33));
			  mv.addObject("s34", hm.get(34));
			  mv.addObject("s35", hm.get(35));
			  mv.addObject("s36", hm.get(36));
			  
			  mv.addObject("JDate",JDate);
			  mv.addObject("email",email);
			  mv.addObject("fromCity",fromCity);
			  mv.addObject("toCity",toCity);
			  mv.addObject("busName",busName);
			  mv.setViewName("reservation");
			  return mv;
		  }
		  else
		  {
			  hm=new HashMap<Integer,String>();
			  hm.put(1, "N");
			  hm.put(2, "N");
			  hm.put(3, "N");
			  hm.put(4, "N");
			  hm.put(5, "N");
			  hm.put(6, "N");
			  hm.put(7, "N");
			  hm.put(8, "N");
			  hm.put(9, "N");
			  hm.put(10, "N");
			  hm.put(11, "N");
			  hm.put(12, "N");
			  hm.put(13, "N");
			  hm.put(14, "N");
			  hm.put(15, "N");
			  hm.put(16, "N");
			  hm.put(17, "N");
			  hm.put(18, "N");
			  hm.put(19, "N");
			  hm.put(20, "N");
			  hm.put(21, "N");
			  hm.put(22, "N");
			  hm.put(23, "N");
			  hm.put(24, "N");
			  hm.put(25, "N");
			  hm.put(26, "N");
			  hm.put(27, "N");
			  hm.put(28, "N");
			  hm.put(29, "N");
			  hm.put(30, "N");
			  hm.put(31, "N");
			  hm.put(32, "N");
			  hm.put(33, "N");
			  hm.put(34, "N");
			  hm.put(35, "N");
			  hm.put(36, "N");
			  
			  mv.addObject("s1", hm.get(1));
			  mv.addObject("s2", hm.get(2));
			  mv.addObject("s3", hm.get(3));
			  mv.addObject("s4", hm.get(4));
			  mv.addObject("s5", hm.get(5));
			  mv.addObject("s6", hm.get(5));
			  mv.addObject("s7", hm.get(7));
			  mv.addObject("s8", hm.get(8));
			  mv.addObject("s9", hm.get(9));
			  mv.addObject("s10", hm.get(10));
			  mv.addObject("s11", hm.get(11));
			  mv.addObject("s12", hm.get(12));
			  mv.addObject("s13", hm.get(13));
			  mv.addObject("s14", hm.get(14));
			  mv.addObject("s15", hm.get(15));
			  mv.addObject("s16", hm.get(16));
			  mv.addObject("s17", hm.get(17));
			  mv.addObject("s18", hm.get(18));
			  mv.addObject("s19", hm.get(19));
			  mv.addObject("s20", hm.get(20));
			  mv.addObject("s21", hm.get(21));
			  mv.addObject("s22", hm.get(22));
			  mv.addObject("s23", hm.get(23));
			  mv.addObject("s24", hm.get(24));
			  mv.addObject("s25", hm.get(25));
			  mv.addObject("s26", hm.get(26));
			  mv.addObject("s27", hm.get(27));
			  mv.addObject("s28", hm.get(28));
			  mv.addObject("s29", hm.get(29));
			  mv.addObject("s30", hm.get(30));
			  mv.addObject("s31", hm.get(31));
			  mv.addObject("s32", hm.get(32));
			  mv.addObject("s33", hm.get(33));
			  mv.addObject("s34", hm.get(34));
			  mv.addObject("s35", hm.get(35));
			  mv.addObject("s36", hm.get(36));
			  
			  mv.addObject("JDate",JDate);
			  mv.addObject("email",email);
			  mv.addObject("fromCity",fromCity);
			  mv.addObject("toCity",toCity);
			  mv.addObject("busName",busName);
			  mv.setViewName("reservation");
			  return mv;
		  }
		  
		 
		  
		  
		  
	  }
}
