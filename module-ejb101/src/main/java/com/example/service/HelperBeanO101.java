package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO101 {

    @EJB
    private HelperBeanN101 helperBeanN101;

    public String identify() {
        return "HelperBeanO101";
    }
}
