package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL18 {

    @EJB
    private HelperBeanK18 helperBeanK18;

    public String identify() {
        return "HelperBeanL18";
    }
}
