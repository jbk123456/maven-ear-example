package com.example.hello;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.service.ExampleService;

@Named("helloWorld")
public class HelloWorld {
   
   @Inject
   Message messageBean;
   
   @Inject
   ExampleService exampleService;  


   public HelloWorld() {
      System.out.println("HelloWorld started!!!");   
   }
   
   public String getMessage() {
        
      return messageBean.getMessage()==null? "oops, message is null!" : messageBean.getMessage() + "; " + String.valueOf(exampleService.whoAmI());
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
