package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB38 {

    @EJB
    private HelperBeanA38 helperBeanA38;

    public String identify() {
        return "HelperBeanB38";
    }
}
