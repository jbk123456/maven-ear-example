package com.example.hello;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.service.IExampleService;
import com.example.to.UtilTO;

@Named("helloWorld")
@ApplicationScoped 
public class HelloWorld {
   
   @Inject
   Message messageBean;
   
   @EJB
   transient IExampleService exampleService = null;


   public HelloWorld() {
      com.google.gson.Gson gson = new com.google.gson.Gson();
      System.out.println("HelloWorld started!" + gson.hashCode() + " " + new UtilTO().hashCode());   
   }
   
 
   public String getMessage() {
      String remoteUser = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
      System.out.println("remoteUser:::"+remoteUser);
      com.google.gson.Gson gson = new com.google.gson.Gson();
      System.out.println("HelloWorld getMessage!" + gson.hashCode() + " " + new UtilTO().hashCode());   
   
      return messageBean.getMessage()==null? "oops, message is null!" : messageBean.getMessage() + "; " + String.valueOf(exampleService.whoAmI(null));
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
