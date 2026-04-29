package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG53 {

    @EJB
    private HelperBeanF53 helperBeanF53;

    public String identify() {
        return "HelperBeanG53";
    }
}
