package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD67 {

    @EJB
    private HelperBeanC67 helperBeanC67;

    public String identify() {
        return "HelperBeanD67";
    }
}
