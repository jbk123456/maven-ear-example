package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE168 {

    @EJB
    private HelperBeanD168 helperBeanD168;

    public String identify() {
        return "HelperBeanE168";
    }
}
