package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI9 {

    @EJB
    private HelperBeanH9 helperBeanH9;

    public String identify() {
        return "HelperBeanI9";
    }
}
