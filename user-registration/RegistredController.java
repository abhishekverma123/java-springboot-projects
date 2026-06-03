package com.example.Website.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistredController {
      @RequestMapping("/GotoRegistationPage")
      public String getRegistrationPage() {
    	  return "registationPage";
      }
}
