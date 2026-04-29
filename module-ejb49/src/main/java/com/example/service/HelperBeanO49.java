package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO49 {

    @EJB
    private HelperBeanN49 helperBeanN49;

    public String identify() {
        return "HelperBeanO49";
    }
}
