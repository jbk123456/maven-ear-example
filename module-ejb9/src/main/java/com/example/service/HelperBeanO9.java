package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO9 {

    @EJB
    private HelperBeanN9 helperBeanN9;

    public String identify() {
        return "HelperBeanO9";
    }
}
