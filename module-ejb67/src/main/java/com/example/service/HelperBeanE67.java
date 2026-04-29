package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE67 {

    @EJB
    private HelperBeanD67 helperBeanD67;

    public String identify() {
        return "HelperBeanE67";
    }
}
