package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL46 {

    @EJB
    private HelperBeanK46 helperBeanK46;

    public String identify() {
        return "HelperBeanL46";
    }
}
