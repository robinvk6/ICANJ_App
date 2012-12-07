package org.icanj.app.directory.controller;

import javax.servlet.http.HttpServletRequest;

import org.icanj.app.directory.entity.Address;
import org.icanj.app.directory.entity.Member;
import org.icanj.app.directory.service.DirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Directory")
public class DirectoryController {
	
	@Autowired
	private DirectoryService directoryServiceImpl;
	
	
	
	@RequestMapping(value= "/FamilySignup", method =RequestMethod.GET)
	public String addMember(HttpServletRequest request){
		
		java.util.Date myDate = new java.util.Date("10/10/2009"); 
		java.sql.Date sqlDate = new java.sql.Date(myDate.getDate()); 

		Address address = new Address();
		Member member = new Member();
		
		
		String password = "plaintextPassword";
		
		
	
		
		
		address.setCity("New Milford");
		address.setStreetAddress("379 Webster Dr");
		address.setState("NJ");
		address.setCountry("USA");
		
	//	member.setAddress(address);
		member.setCellPhoneNumber("2012187495");
		member.setDateOfBirth(sqlDate);
		
		member.setFirstName("Robin");
	//	member.setHomePhoneNumber("2012187495");
		member.setLastName("Varghese");
		member.setWorkPhoneNumber("2012187495");
	//	member.setAccount(account);
		
		/*member.setEmailAddress("robinvk6@gmail5.com");
		 
		
		directoryServiceImpl.addMember(member);*/
		
		
		return"home";
		
	}
	
	
}
