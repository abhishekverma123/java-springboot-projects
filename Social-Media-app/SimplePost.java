package com.social.media.application.Social.Media.Application;

public class SimplePost implements Post {
       String message;
       
      
       
       public void destroy() {
    	   System.out.println("Post DB is Closed ");
       }
	public void setMessage(String message) {
		
		this.message = message;
		

	}
	

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
