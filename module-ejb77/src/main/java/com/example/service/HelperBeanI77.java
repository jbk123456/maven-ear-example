package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI77 {

    @EJB
    private HelperBeanH77 helperBeanH77;

    public String identify() {
        return "HelperBeanI77";
    }
}
