package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH60 {

    @EJB
    private HelperBeanG60 helperBeanG60;

    public String identify() {
        return "HelperBeanH60";
    }
}
