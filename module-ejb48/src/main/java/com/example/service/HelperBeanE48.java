package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE48 {

    @EJB
    private HelperBeanD48 helperBeanD48;

    public String identify() {
        return "HelperBeanE48";
    }
}
