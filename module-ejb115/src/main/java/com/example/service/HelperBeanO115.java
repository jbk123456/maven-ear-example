package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO115 {

    @EJB
    private HelperBeanN115 helperBeanN115;

    public String identify() {
        return "HelperBeanO115";
    }
}
