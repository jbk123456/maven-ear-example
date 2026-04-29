package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE64 {

    @EJB
    private HelperBeanD64 helperBeanD64;

    public String identify() {
        return "HelperBeanE64";
    }
}
