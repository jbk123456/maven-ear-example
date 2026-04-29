package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO155 {

    @EJB
    private HelperBeanN155 helperBeanN155;

    public String identify() {
        return "HelperBeanO155";
    }
}
