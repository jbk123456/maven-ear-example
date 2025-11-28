package com.example.hello;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.auth.Subject;
import javax.security.auth.login.CredentialExpiredException;
import javax.servlet.http.HttpServletRequest;

import com.example.service.IExampleService;
import com.example.to.UtilTO;
import com.ibm.websphere.security.auth.CredentialDestroyedException;
import com.ibm.websphere.security.auth.WSSubject;
import com.ibm.websphere.security.cred.WSCredential;

@Named("helloWorld")
@ApplicationScoped 
public class HelloWorld {
   
   @Inject
   Message messageBean;
   @Inject
   Principal pr;
   
   @EJB
   transient IExampleService exampleService = null;


   public HelloWorld() {
      com.google.gson.Gson gson = new com.google.gson.Gson();
      System.out.println("HelloWorld started!" + gson.hashCode() + " " + new UtilTO().hashCode());   
   }
   
 
   public String getMessage() {
     
      
      String remoteUser = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
   Principal prx=pr;
   

      HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
System.out.println("Create a new session" + request.getSession().isNew());

     Principal prx2=pr=request.getUserPrincipal();
Set<WSCredential> l= new  HashSet<>();
     WSCredential credential = null;
        try {
            Subject subject = WSSubject.getCallerSubject();
            if (subject != null) {
                credential = (l=subject.getPublicCredentials(WSCredential.class))
                        .iterator().next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   
com.ibm.websphere.security.openidconnect.token.IdToken idToken =
com.ibm.websphere.security.openidconnect.PropagationHelper.getIdToken();
Object s = idToken.getClaim("groups");
Object xx = idToken.getAllClaimsAsJson();
      try {
         System.out.println("-------------------------------remoteUser:::"+credential.getSecurityName());
         System.out.println("-------------------------------remoteUser:::"+credential.getUniqueSecurityName());
         System.out.println("-------------------------------remoteUser:::"+credential.getRealmUniqueSecurityName());
         System.out.println("-------------------------------remoteUser:::"+credential.getRealmName());
         System.out.println("-------------------------------remoteUser:::"+l.size());
         System.out.println("-------------------------------remoteUser:::"+pr + " " +credential.getGroupIds());
         System.out.println("-------------------------------remoteUser:::"+s);
         System.out.println("-------------------------------remoteUser:::"+xx);
      } catch (CredentialExpiredException | CredentialDestroyedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      com.google.gson.Gson gson = new com.google.gson.Gson();
      System.out.println("HelloWorld getMessage!" + gson.hashCode() + " " + new UtilTO().hashCode());   
   
      return messageBean.getMessage()==null? "oops, message is null!" : messageBean.getMessage() + "; " + String.valueOf(exampleService.whoAmI(null));
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
