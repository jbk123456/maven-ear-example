package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO151 {

    @EJB
    private HelperBeanN151 helperBeanN151;

    public String identify() {
        return "HelperBeanO151";
    }
}
