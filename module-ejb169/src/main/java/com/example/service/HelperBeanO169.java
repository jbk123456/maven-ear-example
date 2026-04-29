package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO169 {

    @EJB
    private HelperBeanN169 helperBeanN169;

    public String identify() {
        return "HelperBeanO169";
    }
}
