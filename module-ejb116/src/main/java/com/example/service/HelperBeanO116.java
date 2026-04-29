package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO116 {

    @EJB
    private HelperBeanN116 helperBeanN116;

    public String identify() {
        return "HelperBeanO116";
    }
}
