package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO63 {

    @EJB
    private HelperBeanN63 helperBeanN63;

    public String identify() {
        return "HelperBeanO63";
    }
}
