package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE54 {

    @EJB
    private HelperBeanD54 helperBeanD54;

    public String identify() {
        return "HelperBeanE54";
    }
}
