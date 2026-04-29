package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE100 {

    @EJB
    private HelperBeanD100 helperBeanD100;

    public String identify() {
        return "HelperBeanE100";
    }
}
