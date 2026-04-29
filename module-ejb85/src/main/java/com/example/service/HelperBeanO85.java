package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO85 {

    @EJB
    private HelperBeanN85 helperBeanN85;

    public String identify() {
        return "HelperBeanO85";
    }
}
