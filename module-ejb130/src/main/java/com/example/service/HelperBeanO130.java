package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO130 {

    @EJB
    private HelperBeanN130 helperBeanN130;

    public String identify() {
        return "HelperBeanO130";
    }
}
