package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN151 {

    @EJB
    private HelperBeanM151 helperBeanM151;

    public String identify() {
        return "HelperBeanN151";
    }
}
