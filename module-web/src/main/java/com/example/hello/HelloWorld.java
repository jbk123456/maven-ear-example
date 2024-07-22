package com.example.hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
   @ManagedProperty(value = "#{message}")
   private Message messageBean;
   private String message;
   
   public HelloWorld() {
      System.out.println("HelloWorld started!!!");   
      String impl = FacesContext.class.getPackage().getImplementationVersion();
      String spec = FacesContext.class.getPackage().getSpecificationVersion();
      System.out.format("jsf-version::: %s  => %s", impl, spec);   

   }
   
   public String getMessage() {
      
      if(messageBean != null) {
         message = messageBean.getMessage();
      }       
      return message;
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
