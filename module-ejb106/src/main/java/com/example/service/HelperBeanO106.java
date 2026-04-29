package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO106 {

    @EJB
    private HelperBeanN106 helperBeanN106;

    public String identify() {
        return "HelperBeanO106";
    }
}
