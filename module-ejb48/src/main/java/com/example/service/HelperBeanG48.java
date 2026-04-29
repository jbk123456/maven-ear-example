package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG48 {

    @EJB
    private HelperBeanF48 helperBeanF48;

    public String identify() {
        return "HelperBeanG48";
    }
}
