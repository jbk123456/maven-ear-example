package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO75 {

    @EJB
    private HelperBeanN75 helperBeanN75;

    public String identify() {
        return "HelperBeanO75";
    }
}
