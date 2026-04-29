package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE139 {

    @EJB
    private HelperBeanD139 helperBeanD139;

    public String identify() {
        return "HelperBeanE139";
    }
}
