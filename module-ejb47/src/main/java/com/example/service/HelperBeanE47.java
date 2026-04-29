package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE47 {

    @EJB
    private HelperBeanD47 helperBeanD47;

    public String identify() {
        return "HelperBeanE47";
    }
}
