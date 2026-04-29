package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK27 {

    @EJB
    private HelperBeanJ27 helperBeanJ27;

    public String identify() {
        return "HelperBeanK27";
    }
}
