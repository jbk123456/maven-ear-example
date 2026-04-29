package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ9 {

    @EJB
    private HelperBeanI9 helperBeanI9;

    public String identify() {
        return "HelperBeanJ9";
    }
}
