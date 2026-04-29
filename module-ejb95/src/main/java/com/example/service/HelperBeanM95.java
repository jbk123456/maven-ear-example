package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM95 {

    @EJB
    private HelperBeanL95 helperBeanL95;

    public String identify() {
        return "HelperBeanM95";
    }
}
