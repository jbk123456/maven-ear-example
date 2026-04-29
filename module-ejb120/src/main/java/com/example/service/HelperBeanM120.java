package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM120 {

    @EJB
    private HelperBeanL120 helperBeanL120;

    public String identify() {
        return "HelperBeanM120";
    }
}
