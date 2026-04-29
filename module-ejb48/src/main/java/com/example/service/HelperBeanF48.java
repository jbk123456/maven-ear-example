package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF48 {

    @EJB
    private HelperBeanE48 helperBeanE48;

    public String identify() {
        return "HelperBeanF48";
    }
}
