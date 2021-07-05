package com.onlineReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onlineReservation.model.BookingModel;
import com.onlineReservation.model.UserModel;
import com.onlineReservation.repository.BookingRepo;
import com.onlineReservation.repository.UserRepo;
import com.onlineReservation.service.UserService;


@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	BookingRepo bookRepo;
	
	
	/*
	 * @GetMapping("/allUserDetails") public List<UserModel> getAllUser() {
	 * 
	 * return userRepo.findAll();
	 * 
	 * }
	 */
	
	
	
	@GetMapping("/signinAdmin")
	public ModelAndView adminLogin(ModelAndView mv)
	{
		mv.setViewName("adminLogin");
		return mv;
	}
	
	@PostMapping("Adminlogin")
	public ModelAndView adminSignVerification (@Param("email") String email, @Param("password") String password,@Param("loginForm") String loginForm, ModelAndView mv)
	{
		if(email.equals("admin@zline.com") && password.equals("Admin@123"))
		{
			mv.setViewName("adminManagePage");
			return mv;
		}
		else
		{
			mv.setViewName("adminLogin");
			return mv;
		}
	}
	@PostMapping("/chooseLogin")
	public ModelAndView signPageChoose(@Param("loginInfo") String loginInfo , ModelAndView mv)
	{
		System.out.println(loginInfo+" LOGIN INFO");
		mv.addObject("loginInfo",loginInfo);
		mv.setViewName("signin");
		return mv;
	}
	@PostMapping("/login")
	public ModelAndView signPage(@Param("email") String email, @Param("password") String password,@Param("loginForm") String loginForm, ModelAndView mv)
	{
		System.out.println("Sign In Page");
		System.out.println("Validating UserId and Password");
		
		
		System.out.println(userService.getUserByemailOrPhone(email,password));
		if(userService.getUserByemailOrPhone(email,password).equals("Unsuccessfull"))
		{
			mv.addObject("UserLogged", "Failed");
			mv.setViewName("signin");
			return mv;
		}
		else
		{
			if(loginForm.equals("manage"))
			{   List<BookingModel> bm=bookRepo.findByUserId(email);
				mv.addObject("size",bm.size());
				mv.addObject("model",bm);
				mv.addObject("email",email);
				mv.setViewName("manageBooking");
				return mv;
			}
			
			mv.addObject("email",email);
			mv.addObject("UserLogged", "Success");
			mv.setViewName("reserve");
			return mv;
		}
	}
	
	
	@PostMapping("/addUser")
	public ModelAndView addUser(@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("email") String email,@Param("mobile") String mobile,@Param("password") String password,ModelAndView mv)
	{
		if(userService.createNewUser(firstName, lastName, email, mobile, password).equals("User Added Successfully."))
				{
					mv.setViewName("signin");
					return mv;
				}
		else
		{
			mv.setViewName("register");
			return mv;
		}
		
	}
	
}
