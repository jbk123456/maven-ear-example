package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK61 {

    @EJB
    private HelperBeanJ61 helperBeanJ61;

    public String identify() {
        return "HelperBeanK61";
    }
}
