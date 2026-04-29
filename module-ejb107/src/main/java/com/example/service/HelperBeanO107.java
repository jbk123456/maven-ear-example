package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO107 {

    @EJB
    private HelperBeanN107 helperBeanN107;

    public String identify() {
        return "HelperBeanO107";
    }
}
