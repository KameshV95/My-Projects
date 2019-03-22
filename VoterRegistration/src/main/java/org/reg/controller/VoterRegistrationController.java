package org.reg.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.reg.bean.VoterDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VoterRegistrationController {
	
	@RequestMapping(value="/EiligibilityCheck")
	public ModelAndView openCheck(){
		
		return new ModelAndView("EligibilityCheck");

	}
	
	@RequestMapping(value="/date",method=RequestMethod.POST)
	public ModelAndView getDate(@RequestParam("dob") String dob) throws ParseException {
		
	    SimpleDateFormat sformat= new SimpleDateFormat("yyyy-MM-dd");
		
		Date edob =sformat.parse(dob);
		Date date= new Date();
		String sysDate=sformat.format(date);
		Date cdate=sformat.parse(sysDate);
		
		int currentDate=cdate.getYear();	
		int enteredDate=edob.getYear();
		int result= currentDate-enteredDate;
		 if(result>=18) {		 
		return new ModelAndView("VoterRegistration");
		 }	 
		else {
		return new ModelAndView("Failure");
		}
	    
	}
	
	@RequestMapping(value="/voterRegistration")
	public ModelAndView registrationSuccess(){
		
		return new ModelAndView("RegistrationSuccess");

	}
	

	@SuppressWarnings("unused")
	private VoterDetails prepareDetails(VoterDetails voterDetailsOfModel) {
		
		VoterDetails voterDetails=new VoterDetails();
		voterDetails.setFirstName(voterDetailsOfModel.getFirstName());
		voterDetails.setMiddleName(voterDetailsOfModel.getMiddleName());
		voterDetails.setLastName(voterDetailsOfModel.getLastName());
		voterDetails.setFatherName(voterDetailsOfModel.getFatherName());
		voterDetails.setGender(voterDetailsOfModel.getGender());
		voterDetails.setDateOfBirth(voterDetailsOfModel.getDateOfBirth());
		voterDetails.setAge(voterDetailsOfModel.getAge());
		voterDetails.setAddress(voterDetailsOfModel.getConstituency());
		voterDetails.setConstituency(voterDetailsOfModel.getConstituency());
		
		return voterDetails;
		
	}
	
	
	
}

