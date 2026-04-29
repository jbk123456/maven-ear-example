package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB91 {

    @EJB
    private HelperBeanA91 helperBeanA91;

    public String identify() {
        return "HelperBeanB91";
    }
}
