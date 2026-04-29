package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO29 {

    @EJB
    private HelperBeanN29 helperBeanN29;

    public String identify() {
        return "HelperBeanO29";
    }
}
