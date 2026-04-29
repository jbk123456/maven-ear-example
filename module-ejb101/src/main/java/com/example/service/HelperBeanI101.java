package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI101 {

    @EJB
    private HelperBeanH101 helperBeanH101;

    public String identify() {
        return "HelperBeanI101";
    }
}
