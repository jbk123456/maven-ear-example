package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO145 {

    @EJB
    private HelperBeanN145 helperBeanN145;

    public String identify() {
        return "HelperBeanO145";
    }
}
