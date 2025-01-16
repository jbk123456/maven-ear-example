package com.example.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.service.IExampleService;
import com.example.service.IRemoteExampleService;
import com.example.to.ExampleTO;

@Stateless
@Remote
public class RemoteExampleService implements IRemoteExampleService {

    @Override
    public String whoAmI(ExampleTO to) {
        //Gson gson = new Gson();
      
        return "i'm a RemoteExampleService";// + gson.hashCode();
    }

}
