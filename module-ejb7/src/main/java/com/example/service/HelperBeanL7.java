package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL7 {

    @EJB
    private HelperBeanK7 helperBeanK7;

    public String identify() {
        return "HelperBeanL7";
    }
}
