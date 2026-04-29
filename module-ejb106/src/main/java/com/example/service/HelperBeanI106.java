package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI106 {

    @EJB
    private HelperBeanH106 helperBeanH106;

    public String identify() {
        return "HelperBeanI106";
    }
}
