package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH48 {

    @EJB
    private HelperBeanG48 helperBeanG48;

    public String identify() {
        return "HelperBeanH48";
    }
}
