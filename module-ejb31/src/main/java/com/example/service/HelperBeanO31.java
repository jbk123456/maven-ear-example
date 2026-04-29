package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO31 {

    @EJB
    private HelperBeanN31 helperBeanN31;

    public String identify() {
        return "HelperBeanO31";
    }
}
