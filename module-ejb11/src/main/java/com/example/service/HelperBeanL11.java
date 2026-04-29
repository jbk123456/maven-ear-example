package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL11 {

    @EJB
    private HelperBeanK11 helperBeanK11;

    public String identify() {
        return "HelperBeanL11";
    }
}
