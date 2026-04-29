package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE13 {

    @EJB
    private HelperBeanD13 helperBeanD13;

    public String identify() {
        return "HelperBeanE13";
    }
}
