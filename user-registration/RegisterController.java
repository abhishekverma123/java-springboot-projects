package com.example.CarService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.config.annotation.CorsRegistration;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.Registration;




@Controller
public class RegisterController {

/**
 1. Modify the below funtion.
 2. getRegistrationPage method accepts Model as argument.
**/
	@Autowired
	Registration registration;
    @RequestMapping("/register")
    public String getRegistrationPage(Model uiModel){
    	   Vehicle  car =  registration.getNewCar();
    	        uiModel.addAttribute("car",car);
    	
        return "carregister";
    }


  /*
   1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
   2. It should return "success" if registerCar() return true else it should return "carregister".
   3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
  */
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute(value = "car") Car car){
        //Write your logic here
    	if(car.getRegisterationNumber()!= null && 
    			car.getCarDetails()!=null &&
    			car.getCarName() !=null &&
    			car.getCarWork() != null &&
    			!car.getRegisterationNumber().isEmpty() &&
    			!car.getCarDetails().isEmpty() && 
    			!car.getCarName().isEmpty() && 
    			!car.getCarWork().isEmpty()
    			) {
    	if(registration.registerCar(car.getRegisterationNumber(),car.getCarName(),car.getCarDetails(),car.getCarWork())){
    		   
        return "success";
    }
    	}
    	return "carregister";
}
}   
