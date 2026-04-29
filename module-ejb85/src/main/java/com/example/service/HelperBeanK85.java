package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK85 {

    @EJB
    private HelperBeanJ85 helperBeanJ85;

    public String identify() {
        return "HelperBeanK85";
    }
}
