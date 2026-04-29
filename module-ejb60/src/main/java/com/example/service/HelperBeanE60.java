package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE60 {

    @EJB
    private HelperBeanD60 helperBeanD60;

    public String identify() {
        return "HelperBeanE60";
    }
}
