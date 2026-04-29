package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI27 {

    @EJB
    private HelperBeanH27 helperBeanH27;

    public String identify() {
        return "HelperBeanI27";
    }
}
