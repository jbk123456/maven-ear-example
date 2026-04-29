package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB86 {

    @EJB
    private HelperBeanA86 helperBeanA86;

    public String identify() {
        return "HelperBeanB86";
    }
}
