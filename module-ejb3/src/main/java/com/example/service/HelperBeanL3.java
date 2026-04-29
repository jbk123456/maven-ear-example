package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL3 {

    @EJB
    private HelperBeanK3 helperBeanK3;

    public String identify() {
        return "HelperBeanL3";
    }
}
