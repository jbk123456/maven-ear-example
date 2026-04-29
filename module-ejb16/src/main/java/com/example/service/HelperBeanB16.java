package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB16 {

    @EJB
    private HelperBeanA16 helperBeanA16;

    public String identify() {
        return "HelperBeanB16";
    }
}
