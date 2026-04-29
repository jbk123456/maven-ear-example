package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO17 {

    @EJB
    private HelperBeanN17 helperBeanN17;

    public String identify() {
        return "HelperBeanO17";
    }
}
