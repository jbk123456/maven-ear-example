package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE21 {

    @EJB
    private HelperBeanD21 helperBeanD21;

    public String identify() {
        return "HelperBeanE21";
    }
}
