package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE177 {

    @EJB
    private HelperBeanD177 helperBeanD177;

    public String identify() {
        return "HelperBeanE177";
    }
}
