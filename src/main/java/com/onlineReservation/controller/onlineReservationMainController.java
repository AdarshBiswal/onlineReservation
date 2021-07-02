package com.onlineReservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class onlineReservationMainController {
	
	@GetMapping("/")
	public ModelAndView homePage(ModelAndView mv)
	{
		System.out.println("Home ");
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("/signin")
	public ModelAndView signPage(ModelAndView mv)
	{
		System.out.println("Sign In Page ");
		mv.setViewName("signin");
		return mv;
	}
	@GetMapping("/busList")
	public ModelAndView reservationPage(ModelAndView mv)
	{
		System.out.println("WELCOME TO MYBUSBOOKING ");
		mv.setViewName("busList");
		return mv;
	}
	@GetMapping("/register")
	public ModelAndView userRegistration(ModelAndView mv)
	{
		System.out.println("WELCOME TO User Registraton ");
		mv.setViewName("register");
		return mv;
	}
	@GetMapping("/reserve")
	public ModelAndView booking(ModelAndView mv)
	{
		System.out.println("WELCOME TO User Registraton ");
		mv.setViewName("reservation");
		return mv;
	}
	
	

}
