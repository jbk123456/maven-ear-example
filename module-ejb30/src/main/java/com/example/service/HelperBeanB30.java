package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB30 {

    @EJB
    private HelperBeanA30 helperBeanA30;

    public String identify() {
        return "HelperBeanB30";
    }
}
