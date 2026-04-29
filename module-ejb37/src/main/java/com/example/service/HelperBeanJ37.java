package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ37 {

    @EJB
    private HelperBeanI37 helperBeanI37;

    public String identify() {
        return "HelperBeanJ37";
    }
}
