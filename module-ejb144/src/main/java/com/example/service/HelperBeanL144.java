package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL144 {

    @EJB
    private HelperBeanK144 helperBeanK144;

    public String identify() {
        return "HelperBeanL144";
    }
}
