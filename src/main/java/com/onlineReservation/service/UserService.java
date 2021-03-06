package com.onlineReservation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineReservation.model.UserModel;
import com.onlineReservation.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public String createNewUser (String firstName,String lastName,String email,String mobile,String password)
	{
		UserModel umr=new UserModel(firstName,lastName,email,mobile,password);
		System.out.println(umr.getId());
		
		try {
			   
			
			    
				if(userRepo.findByMobile(mobile)!=null)
				{
					System.out.println("Mobile Number  already Exist.Cannot Add User");
					return "Mobile Number  already Exist";
				}
				if(userRepo.findByMobile(email)!=null)
				{
					return "Emaid id  already Exist";
				}
				else
				{
					userRepo.save(umr);
					return "User Added Successfully.";
				}
				
				
			
			
		}
		catch(Exception e) {
			
			
			userRepo.save(umr);
			return "User Added Successfully.";
			
		}
		
		
	}
	
	public String getUserByemailOrPhone(String emailOrNumber,String password)
	{
		
		try {
			boolean isPhoneNumber=false;
			
			
			
			for(int i=0;i<emailOrNumber.length();i++)
			{
				if (emailOrNumber.charAt(i) >= '0' && emailOrNumber.charAt(i) <= '9') 
				{
					isPhoneNumber =true;
		        }
				else
				{
					isPhoneNumber=false;
					break;
				}
			}
			
			if(isPhoneNumber==false)
			{   

				if(userRepo.findByEmail(emailOrNumber)!=null)
				{
					
					UserModel um=userRepo.findByEmail(emailOrNumber);
					
					if(um.getPassword().equals(password))
					{
						System.out.println("UserID retrived");
						return "Success";
					}
					else
					{
						System.out.println("PASSWORD FOR THE USER NAME IS INCORRECT");
						return "Unsuccessfull";
					}
					
				}
				else
				{
					System.out.println("UserID not retrived failed for email");
					return "Unsuccessfull";
				}
				
				
			}
			else
			{
				if(userRepo.findByMobile(emailOrNumber)!=null)
				{
					UserModel um=userRepo.findByMobile(emailOrNumber);
					
					if(um.getPassword().equals(password))
					{
						System.out.println("UserID retrived");
						return "Success";
					}
					else
					{
						System.out.println("PASSWORD FOR THE USER NAME IS INCORRECT");
						return "Unsuccessfull";
					}
				}
				else
				{
					System.out.println("UserID not retrived failed for email");
					return "Unsuccessfull";
				}
					
			}
			
		}catch(Exception e)
			{
				
				System.out.println("User Not Found");
				return "Unsuccessfull";
			}
			
	}

}
