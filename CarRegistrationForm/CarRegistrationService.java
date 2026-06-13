package com.example.CarService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarService.domain.Vehicle;

/**

 1. Implement the interface Registration and Override the method registerCar() and getNewCar() in CarRegistrationService.
 2. Also,autowire car of type Vehicle and use it in method registerCar() and getNewCar().

**/

@Service
public class CarRegistrationService implements Registration{
//	  String vehicleNo;
//	  String vehicleName;
//	  String CarDetails;
//	  String CarWork;
	@Autowired
	Vehicle vehicle;
	 /** Method registerCar uses createVehicle method for creating a vehicle and based on saveVehicleDetails method it returns true or false. **/
	
	
	@Override
    public Boolean registerCar(String vehicleNo,String vehicleName,String CarDetails,String CarWork) {
//		       this.CarDetails = CarDetails;
//		       this.CarWork = CarWork;
//		       this.vehicleName = vehicleName;
//		       this.vehicleNo = vehicleNo;
    	  vehicle.createVehicle(vehicleNo, vehicleName, CarDetails, CarWork);
    	  return  vehicle.saveVehicleDetails();
    	  
    }

    /** It simply returns a car of type Vehicle (please refer
     *  CarRegistrationService for further explanation). **/
	@Override
    public Vehicle getNewCar() {
    	  return vehicle; 
    }

}
