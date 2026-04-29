package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO119 {

    @EJB
    private HelperBeanN119 helperBeanN119;

    public String identify() {
        return "HelperBeanO119";
    }
}
