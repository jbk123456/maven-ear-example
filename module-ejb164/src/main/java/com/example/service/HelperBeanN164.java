package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN164 {

    @EJB
    private HelperBeanM164 helperBeanM164;

    public String identify() {
        return "HelperBeanN164";
    }
}
