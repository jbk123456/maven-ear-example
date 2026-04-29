package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO122 {

    @EJB
    private HelperBeanN122 helperBeanN122;

    public String identify() {
        return "HelperBeanO122";
    }
}
