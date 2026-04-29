package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO28 {

    @EJB
    private HelperBeanN28 helperBeanN28;

    public String identify() {
        return "HelperBeanO28";
    }
}
