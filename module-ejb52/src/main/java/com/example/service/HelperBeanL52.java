package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL52 {

    @EJB
    private HelperBeanK52 helperBeanK52;

    public String identify() {
        return "HelperBeanL52";
    }
}
