package com.example.Vaccination;

import com.example.Vaccination.User;

/**
  This class is an implementation of a User Interface based on the selection 
  in the console the user type is selected.You need to complete this class 
  based on the following tasks.
    
   Tasks:
 a.Override the methods of User Interface.
 b.Adding common attributes:
    1. String name
    2. Integer age
    3. boolean isVaccinated
    4. TimeAndLocation(class), vaccine(interface), both are injected by the constructor method.
    5. The arguments of the constructor for all users should be like "public User(TimeAndLocation timeAndLocation, Vaccine vaccine)"
 c.Build the logic for all the methods based on the description mentioned in the User Interface.
 
**/
public class Self implements User {
	 public String name;
     private int age;
     private boolean isVaccinated;
     // reference of  Vaccine interface and timeAndLocation class
     private TimeAndLocation  timeAndLocation;
     private Vaccine vaccine;
     
     // Using Setter DI 
     
     public void setTimeAndLocation(TimeAndLocation timeAndLocation) {
			this.timeAndLocation = timeAndLocation;
		}
   
     
     public void setVaccine(Vaccine vaccine) {
			this.vaccine = vaccine;
		}
     // using Constructor DI
     
     
//	 public Self(TimeAndLocation timeAndLocation,Vaccine vaccine) {
//   
//     	this.timeAndLocation = timeAndLocation;	
//      	this.vaccine = vaccine;
//      	 this.isVaccinated = false;
//     }
	 
//	    public void setUserTimeLocationDetails(String timeSlot, String location, String date) {
//	        this.timeSlot = timeSlot;
//	        this.location = location;
//	        this.date = date;
//   }
	 @Override
		public Vaccine getVaccineDetails() {
			// TODO Auto-generated method stub
			return this.vaccine;
		}

		@Override
		public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
			// TODO Auto-generated method stub
			this.name = name;
			this.age = age;
			this.timeAndLocation = timeAndLocation;	
		}

		@Override
		public void setAppointment() {
			
			// TODO Auto-generated method stub
			
			/** This function updates vaccination status of the user and prints appointment details in the console with includes user name , Vaccine name and lastly timeAndLocation class based details 
	        For example:  "Hello John your appointment has been fixed for Covid Vaccine on  12 Pm at Mumbai  on 2023-05-10". 
	     **/
			if(!isVaccinated) {
				isVaccinated = true;
			System.out.println("Hello "+this.name+" your appointment has been fixed for "+this.getVaccineDetails().getType()+" Vaccine on "+this.timeAndLocation.getDetails());
			}
			else {
				System.out.println("User is already Vaccinated");
			}
			
		}

		@Override
		public boolean IsVaccinated() {
			if(isVaccinated) {
				  return true;
			}
			// TODO Auto-generated method stub
			return false;
		}
		
		/** This function returns a boolean type indicating the vaccination status of a user. If the user is vaccinated it should return true else false. **/

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}  
	

}
