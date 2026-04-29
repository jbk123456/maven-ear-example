package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI53 {

    @EJB
    private HelperBeanH53 helperBeanH53;

    public String identify() {
        return "HelperBeanI53";
    }
}
