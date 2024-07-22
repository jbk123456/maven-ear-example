package com.example.hello;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import com.example.service.ExampleService;

@javax.inject.Named("message")
public class Message {
   private String message = "Hello World!";
   @Inject 
   ExampleService exampleService;  
   public String getMessage() {
      String impl = FacesContext.class.getPackage().getSpecificationTitle();
      String spec = FacesContext.class.getPackage().getImplementationTitle();

      return String.valueOf(exampleService.whoAmI())+impl + " " + spec+";" +message;
   }
   public void setMessage(String message) {
      this.message = message;
   }
}