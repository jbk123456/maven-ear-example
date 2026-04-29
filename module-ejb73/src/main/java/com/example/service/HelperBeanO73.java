package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO73 {

    @EJB
    private HelperBeanN73 helperBeanN73;

    public String identify() {
        return "HelperBeanO73";
    }
}
