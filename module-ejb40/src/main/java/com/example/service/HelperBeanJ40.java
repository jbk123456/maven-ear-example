package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ40 {

    @EJB
    private HelperBeanI40 helperBeanI40;

    public String identify() {
        return "HelperBeanJ40";
    }
}
