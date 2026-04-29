package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM115 {

    @EJB
    private HelperBeanL115 helperBeanL115;

    public String identify() {
        return "HelperBeanM115";
    }
}
