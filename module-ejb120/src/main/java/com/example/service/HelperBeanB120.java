package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB120 {

    @EJB
    private HelperBeanA120 helperBeanA120;

    public String identify() {
        return "HelperBeanB120";
    }
}
