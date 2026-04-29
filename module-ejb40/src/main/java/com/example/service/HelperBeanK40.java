package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK40 {

    @EJB
    private HelperBeanJ40 helperBeanJ40;

    public String identify() {
        return "HelperBeanK40";
    }
}
