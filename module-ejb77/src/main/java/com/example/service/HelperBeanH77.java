package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH77 {

    @EJB
    private HelperBeanG77 helperBeanG77;

    public String identify() {
        return "HelperBeanH77";
    }
}
