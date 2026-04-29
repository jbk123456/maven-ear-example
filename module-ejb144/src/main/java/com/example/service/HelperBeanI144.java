package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI144 {

    @EJB
    private HelperBeanH144 helperBeanH144;

    public String identify() {
        return "HelperBeanI144";
    }
}
