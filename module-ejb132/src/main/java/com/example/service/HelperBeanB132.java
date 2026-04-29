package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB132 {

    @EJB
    private HelperBeanA132 helperBeanA132;

    public String identify() {
        return "HelperBeanB132";
    }
}
