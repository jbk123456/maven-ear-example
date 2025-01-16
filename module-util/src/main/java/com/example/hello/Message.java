package com.example.hello;

import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.example.service.IExampleService;
import com.example.to.ExampleTO;

@javax.inject.Named("message")
public class Message {
   private ExampleTO exampleTO = new ExampleTO();

   private String message = "Hello World!";
   @Inject 
   IExampleService exampleService;  
   public String getMessage() {
      String impl = FacesContext.class.getPackage().getSpecificationTitle();
      String spec = FacesContext.class.getPackage().getImplementationTitle();

      return String.valueOf(exampleService.whoAmI(exampleTO))+impl + " " + spec+";" +message;
   }
   public void setMessage(String message) {
      this.message = message;
   }
}