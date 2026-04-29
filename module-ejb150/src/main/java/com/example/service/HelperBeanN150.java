package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN150 {

    @EJB
    private HelperBeanM150 helperBeanM150;

    public String identify() {
        return "HelperBeanN150";
    }
}
