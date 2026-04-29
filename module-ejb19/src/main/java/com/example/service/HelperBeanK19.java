package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK19 {

    @EJB
    private HelperBeanJ19 helperBeanJ19;

    public String identify() {
        return "HelperBeanK19";
    }
}
