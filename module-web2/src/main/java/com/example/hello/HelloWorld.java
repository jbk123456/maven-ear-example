package com.example.hello;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.service.IExampleService;

@Named("helloWorld")
@ApplicationScoped 
public class HelloWorld {
   
   @Inject
   Message messageBean;
   
   @EJB
   transient IExampleService exampleService = null;


   public HelloWorld() {
      System.out.println("HelloWorld started!!");   
   }
   
   public String getMessage() {
        
      return messageBean.getMessage()==null? "oops, message is null!" : messageBean.getMessage() + "; " + String.valueOf(exampleService.whoAmI(null));
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
