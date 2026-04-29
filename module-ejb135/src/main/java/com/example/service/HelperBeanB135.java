package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB135 {

    @EJB
    private HelperBeanA135 helperBeanA135;

    public String identify() {
        return "HelperBeanB135";
    }
}
