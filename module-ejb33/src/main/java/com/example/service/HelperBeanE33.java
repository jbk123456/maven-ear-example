package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE33 {

    @EJB
    private HelperBeanD33 helperBeanD33;

    public String identify() {
        return "HelperBeanE33";
    }
}
