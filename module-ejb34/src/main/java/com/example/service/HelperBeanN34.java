package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN34 {

    @EJB
    private HelperBeanM34 helperBeanM34;

    public String identify() {
        return "HelperBeanN34";
    }
}
