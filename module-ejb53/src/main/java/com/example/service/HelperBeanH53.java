package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH53 {

    @EJB
    private HelperBeanG53 helperBeanG53;

    public String identify() {
        return "HelperBeanH53";
    }
}
