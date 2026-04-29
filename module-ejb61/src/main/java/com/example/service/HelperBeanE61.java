package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE61 {

    @EJB
    private HelperBeanD61 helperBeanD61;

    public String identify() {
        return "HelperBeanE61";
    }
}
