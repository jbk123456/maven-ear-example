package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI149 {

    @EJB
    private HelperBeanH149 helperBeanH149;

    public String identify() {
        return "HelperBeanI149";
    }
}
