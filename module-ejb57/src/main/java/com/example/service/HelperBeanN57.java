package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN57 {

    @EJB
    private HelperBeanM57 helperBeanM57;

    public String identify() {
        return "HelperBeanN57";
    }
}
