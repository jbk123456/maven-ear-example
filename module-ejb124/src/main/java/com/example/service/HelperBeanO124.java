package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO124 {

    @EJB
    private HelperBeanN124 helperBeanN124;

    public String identify() {
        return "HelperBeanO124";
    }
}
