package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO133 {

    @EJB
    private HelperBeanN133 helperBeanN133;

    public String identify() {
        return "HelperBeanO133";
    }
}
