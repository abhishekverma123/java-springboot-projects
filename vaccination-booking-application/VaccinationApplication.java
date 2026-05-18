package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class VaccinationApplication {

   
	public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	   
    	    // Prompt of Application
    	
    	System.out.println("Welcome to the Vaccination Application");
    	Scanner scanner = new Scanner(System.in);
    	//User user = (User) context.getBean()
    	
    	 while(true) {
    		 System.out.println("Please choose your vaccine preference:");
    		 
    		 System.out.println("1. Covid");
    		 System.out.println("2. Polio");
    		 System.out.println("3. Typhoid");
    		 int choosePreference = scanner.nextInt();
    		 
    		 scanner.nextLine();
    		  String userName = "";
    		  String userType = "";
    		  
    		 System.out.println("Whom do you want to vaccinate");
  
    		 System.out.println("1. Father");
    		 System.out.println("2. Mother");
    		 System.out.println("3. Spouse");
    		 System.out.println("4. Self");
    		 System.out.println("5. Exit");
    		 int chooseVaccinatePerson = scanner.nextInt();
    		 scanner.nextLine();
    		 
    		 switch(choosePreference) {
    		 case 1 : {
    			     userType = "Covid"; 
    			 switch(chooseVaccinatePerson) {
    			 
    			 case 1:{ 
    				 userName = "father";
    			            break;
    			 }
    		 
    			 case 2:{ 
    				 userName = "mother";
			            break;
			 }
    		 
    		 case 3: {
    		 
    			 userName = "spouse";
		            break;
		 }
    		 
    		 case 4: {
    			

    			 userName = "self";
		            break;  
    		 }
    		 default : {
    			     
    			    return;
    		 }
    			 }
    			 break;
    		 
    		 }
    		 
    		 case 2 : {
    			 userType = "Polio";
                     switch(chooseVaccinatePerson) {
    			 
    			 case 1:{
    			           
    				 userName = "father";
    			            break;
    		 
    			 }
    		 
    
    		 case 2 : {
    			 userName = "mother"; 
		            break;  
    		 }
    		 
    		 case 3: {
    			 
    			 userName = "spouse";
		            break;  
    		 }
    		 case 4: {
    			 
    			 userName = "self";
		            break;  
    		 }
    		 default : {
    			    return;
    		 }
    			 }
                     break;
    		 }
    		 
    		 case 3 : {
    			 userType = "Typhoid";
    			         
                               switch(chooseVaccinatePerson) {
    			 
    			 case 1:{
    				          
    				 userName   = "father";
    			            break;
    		 
    			 }
//    		 
//    
    		 case 2 : {
    			 
    			
    			 userName = "mother";
		            break;  
    		 }
//    		 
    		 case 3: {

    			 userName = "spouse";
		            break;  
    		 }
    		 case 4: {
    			 
    			 userName = "self";
		            break;  
    		 }
    		 default : {
    			    return;
    		         }
    	     }
    	 }
    			 
    			break;            
    		 }
    		 
    		
    		User user = (User) context.getBean(userName + userType); 
    		                
    		        if(user.IsVaccinated()) {
	                    System.out.println("User Ref :"+user);
	                    
    		              System.out.println("User is already Vaccinated");
    		         }
    		                   
    		         else {
    		System.out.println("Please enter "+userName+" details");
    	                    System.out.println("User Ref :"+user);
              
    			System.out.print("Name: ");
    		   String	name = scanner.nextLine();
    			System.out.print("Age: ");
    			int age = scanner.nextInt();

    			scanner.nextLine();
    			 System.out.print("Appointment date (YYYY-MM-DD): ");
    			String userAppointmentDate = scanner.nextLine();
    			 
    			 System.out.print("Appointment time (HH:MM AM/PM): ");
    			String userAppointmentTime = scanner.nextLine();
    			 
    			 System.out.print("Appointment Location : ");
    			String userAppointmentLocation = scanner.nextLine();
    		
    		
    		       
    	//	user.setUserTimeLocationDetails(userAppointmentTime, userAppointmentLocation, userAppointmentDate)
    		//  user.(userAppointmentTime, userAppointmentLocation, userAppointmentDate)
    		// TimeAndLocation t1 =  null;
    		TimeAndLocation t1 =
    			    (TimeAndLocation) context.getBean("timeAndLocation");
    		System.out.println("TimeAndLocation Ref : " + t1);
    		 t1.setDetails(userAppointmentTime, userAppointmentLocation, userAppointmentDate);
    		 user.setUserDetails(name, age, t1);
    		 user.getVaccineDetails();
    		
    		 
    		    user.setAppointment();
    		         }
    		    System.out.println("Do you want to register for Someone Else\n1. Yes\n2. No");
    		    int choice = scanner.nextInt();
    		     if(choice == 1) {
    		    	  continue;
    		     }
    		         
    		     
    		     break;
    		         	
    		 
    	 }
    	 scanner.close();
    	 context.close();
	     
    	
    }
}










