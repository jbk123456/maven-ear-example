package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO152 {

    @EJB
    private HelperBeanN152 helperBeanN152;

    public String identify() {
        return "HelperBeanO152";
    }
}
