package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB94 {

    @EJB
    private HelperBeanA94 helperBeanA94;

    public String identify() {
        return "HelperBeanB94";
    }
}
