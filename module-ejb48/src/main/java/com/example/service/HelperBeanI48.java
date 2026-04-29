package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI48 {

    @EJB
    private HelperBeanH48 helperBeanH48;

    public String identify() {
        return "HelperBeanI48";
    }
}
